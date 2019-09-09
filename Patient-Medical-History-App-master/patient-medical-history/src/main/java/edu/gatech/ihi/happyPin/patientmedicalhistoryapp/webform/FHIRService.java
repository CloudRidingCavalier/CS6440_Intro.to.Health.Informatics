package edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform.WebFormData;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.*;
import java.util.Date;
import org.hl7.fhir.dstu3.model.ContactPoint.ContactPointUse;


import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class FHIRService {

    private IGenericClient client = null;
    //@Value("${fhirBase}")
    private String fhirBase = "http://hapi.fhir.org/baseDstu3";
    public FHIRService(String baseurl) {
        FhirContext ctx = FhirContext.forDstu3();
        client = ctx.newRestfulGenericClient(baseurl);
    }

    // TODO:
    public String addPatient(WebFormData data) {
        String firstName = data.getFirstName();
        String lastName = data.getLastName();
        String socialSecurityNumber = data.getSsn();
        String sex = data.getSex();
        String dob = data.getDataOfBirth();
        String address = data.getBillingAddress();
        String city = data.getCity();
        String state = data.getState();
        String zip = data.getZip();
        String homeTel = data.getHomeTel();
        String workTel = data.getBusTel();
        String cell = data.getCell();
        String marital = data.getMarriage();
        //Place your code here
        Patient patient = new Patient();
        patient.addIdentifier().setSystem("http://hl7.org/fhir/sid/us-ssn").setValue(socialSecurityNumber);
        patient.addName(new HumanName().setFamily(lastName).addGiven(firstName));
        //Set Address
        Address addr = new Address();
        addr.setCity(city);
        addr.setText(address);
        addr.setState(state);
        addr.setPostalCode(zip);
        patient.addAddress(addr);
        //Set Gender
        if(sex.equals("female")){
            patient.setGender(Enumerations.AdministrativeGender.FEMALE);
        }
        else{
            if(sex.equals("male")){
                patient.setGender(Enumerations.AdministrativeGender.MALE);
            }
        }
        //Set DOB 2019-04-01
        String[] DoB = dob.split("//");
        int yyyy = Integer.parseInt(dob.substring(0, 4));
        int mm = Integer.parseInt(dob.substring(5, 7));
        int dd = Integer.parseInt(dob.substring(8));

//        int mm = Integer.parseInt(DoB[0]);
//        int dd = Integer.parseInt(DoB[1]);
//        int yyyy = Integer.parseInt(DoB[2]);
        patient.setBirthDate(new Date(yyyy, mm, dd));
        //Set phone
        if (homeTel != null)
            patient.addTelecom(new ContactPoint().setUse(ContactPointUse.HOME).setValue(homeTel));
        if (cell != null)
            patient.addTelecom(new ContactPoint().setUse(ContactPointUse.MOBILE).setValue(cell));
        if (workTel != null)
            patient.addTelecom(new ContactPoint().setUse(ContactPointUse.WORK).setValue(workTel));
        //Set Marital Data
        CodeableConcept maritalInfo = new CodeableConcept();
        maritalInfo.setText(marital);
        patient.setMaritalStatus(maritalInfo);


        MethodOutcome o = client.create().resource(patient).execute();
        return o.getId().getIdPart();
    }

//    public String updatePatient(WebFormData data) {
//        // TODO:
//        Patient patient = new Patient();
//        String id = getPatientIDBySSN(data.getSsn());
//        // do update:
//
//        patient.setId(id);
//
//        // Invoke the server update method
//        MethodOutcome outcome = client.update().resource(patient).execute();
//
//        IdDt iddt = (IdDt) outcome.getId();
//        System.out.println("Got ID: " + iddt.getValue());
//        String updatedID = iddt.getValue();
//
//        return updatedID;
//    }
    public String updatePatient(WebFormData data) {
        // TODO:
        Patient patient = new Patient();
        String id = getPatientIDBySSN(data.getSsn()); //
        String firstName = data.getFirstName(); //
        String lastName = data.getLastName(); //
        // String socialSecurityNumber = data.getSsn();
        String sex = data.getSex(); //
        String dob = data.getDataOfBirth();
        //mm/dd/yyyy
//        int month = Integer.parseInt(dob.substring(0, 2));
//        int day = Integer.parseInt(dob.substring(3, 5));
//        int year = Integer.parseInt(dob.substring(6));
        int year = Integer.parseInt(dob.substring(0, 4));
        int month = Integer.parseInt(dob.substring(5, 7));
        int day = Integer.parseInt(dob.substring(8));
        String address = data.getBillingAddress(); //
        String city = data.getCity(); //
        String state = data.getState(); //
        String zip = data.getZip(); //
        String homeTel = data.getHomeTel();
        String workTel = data.getBusTel();
        String cell = data.getCell();
        String married = data.getMarriage();
        // do update:

        patient.setId(id);
        HumanName humanName = new HumanName();
        humanName.setFamily(lastName);
        humanName.addGiven(firstName);
        patient.addName(humanName);
        if (sex.equals("female")) {
            patient.setGender(Enumerations.AdministrativeGender.FEMALE);
        } else {
            patient.setGender(Enumerations.AdministrativeGender.MALE);
        }
//        patient.setBirthDate(new Date().setMonth(month).setDate(day).setYear(year));
        patient.setBirthDate(new Date(year, month, day));
        Address newAddress = new Address();
        newAddress.setCity(city).setState(state).setPostalCode(zip);
        newAddress.setText(address);
        List<Address> list = new ArrayList<>();
        list.add(newAddress);
        patient.setAddress(list);
        if (homeTel != null) {
            ContactPoint contactPoint = new ContactPoint();
            contactPoint.setValue(homeTel);
            contactPoint.setUse(ContactPointUse.HOME);
            patient.addTelecom(contactPoint);
        }
        patient.setMaritalStatus(new CodeableConcept().setText(married));


        // Invoke the server update method
        MethodOutcome outcome = client.update().resource(patient).execute();

//        IdDt iddt = (IdDt) outcome.getId();
//        System.out.println("Got ID: " + iddt.getValue());
//        String updatedID = iddt.getValue();

        return outcome.getId().getIdPart();
    }

    public String getPatientIDBySSN(String ssn) {
        // TODO:

        Bundle response = client.search()
                .forResource(Patient.class)
                .where(Patient.IDENTIFIER.exactly().code(ssn))
                .prettyPrint()
                .returnBundle(Bundle.class)
                .execute();

        Patient returnedPatient = null;
        returnedPatient = (Patient) response.getEntry().get(0).getResource();

        String patientID = returnedPatient.getId();

        return patientID;
    }


}

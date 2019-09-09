package edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform;


import javax.persistence.*;

@Entity
public class WebFormData {

    @Column(length = 15)
    private String date; //date
    @Column(length = 15)
    private String firstName;
    @Column(length = 15)
    private String middleName;
    @Column(length = 15)
    private String lastName;
    @Column(length = 15)
    private String dataOfBirth; //date
    @Column(length = 15)
    private String sex; //male  female
    @Column(length = 15)
    private String age;
    @Column(length = 15)
    @Id
    private String ssn;
    @Column(length = 50)
    private String billingAddress;
    @Column(length = 15)
    private String city;
    @Column(length = 15)
    private String state;
    @Column(length = 15)
    private String zip;
    @Column(length = 15)
    private String homeTel;
    @Column(length = 15)
    private String busTel;
    @Column(length = 15)
    private String cell;
    @Column(length = 15)
    private String emergencyContact;
    @Column(length = 15)
    private String physician;
    @Column(length = 15)
    private String dentist;
    @Column(length = 15)
    private String referBy;
    @Column(length = 15)
    private String student; //fulltime parttime
    @Column(length = 15)
    private String school;
    @Column(length = 20)
    private String marriage; //married divorcedlegally separated  widow  single
    @Column(length = 20)
    private String employment; //fulltime parttime retired unemployed
    @Column(length = 15)
    private String personrelated; //self spouse mother father other
    @Column(length = 15)
    private String relatedPersonName;
    @Column(length = 15)
    private String relatedPersonBirthday;
    @Column(length = 15)
    private String relatedPersonSSN;
    @Column(length = 15)
    private String relatedPersonHomeTel;
    @Column(length = 15)
    private String relatedPersonCell;
    @Column(length = 15)
    private String relatedPersonStreet;
    @Column(length = 15)
    private String relatedPersonCity;
    @Column(length = 15)
    private String relatedPersonState;
    @Column(length = 15)
    private String relatedPersonZip;
    @Column(length = 15)
    private String relatedPersonEmployer;
    @Column(length = 15)
    private String relatedPersonEmployerTel;
    @Column(length = 50)
    private String reasonForVisit;
    @Column(length = 15)
    private String employerName;
    @Column(length = 15)
    private String employerTel;
    @Column(length = 50)
    private String employerStreet;
    @Column(length = 15)
    private String employerCity;
    @Column(length = 15)
    private String employerState;
    @Column(length = 15)
    private String employerZip;
    @Column(length = 15)
    private String signeDate; //date
    @Column(length = 15)
    private String signature;
    @Column(length = 50)
    private String reasonForVisit2;
    @Column(length = 15)
    private String height;
    @Column(length = 15)
    private String weight;
    @Column(length = 15)
    private String inHealthYN; //yes no
    @Column(length = 3)
    private String changeInHealthYN; //yes no
    @Column(length = 3)
    private String underPhysicianYN; //yes no
    @Column(length = 50)
    private String treat;
    @Column(length = 3)
    private String illnessYN; //yes no
    @Column(length = 15)
    private String injuryWhere;
    @Column(length = 3)
    private String injuryYN;
    @Column(length = 3)
    private String p2n6YN;
    @Column(length = 3)
    private String p2n7YN;
    @Column(length = 3)
    private String p2n8YN;
    @Column(length = 3)
    private String p2n9YN;
    @Column(length = 3)
    private String p2n10YN;
    @Column(length = 3)
    private String p2n11YN;
    @Column(length = 3)
    private String p2n12YN;
    @Column(length = 3)
    private String p2n13YN;
    @Column(length = 3)
    private String p2n14YN;
    @Column(length = 3)
    private String p2n15YN;
    @Column(length = 3)
    private String p2n16YN;
    @Column(length = 3)
    private String p2n17YN;
    @Column(length = 3)
    private String p2n18YN;
    @Column(length = 3)
    private String p2n19YN;
    @Column(length = 3)
    private String p2n20YN;
    @Column(length = 3)
    private String p2n21YN;
    @Column(length = 3)
    private String p2n22YN;
    @Column(length = 3)
    private String p2n23YN;
    @Column(length = 3)
    private String p2n24YN;
    @Column(length = 3)
    private String p2n25YN;
    @Column(length = 3)
    private String p2n26YN;
    @Column(length = 3)
    private String p2n27YN;
    @Column(length = 3)
    private String p2n28YN;
    @Column(length = 3)
    private String p2n29YN;
    @Column(length = 3)
    private String p2n30YN;
    @Column(length = 3)
    private String p2n31YN;
    @Column(length = 3)
    private String p2n32YN;
    @Column(length = 3)
    private String p2n33YN;
    @Column(length = 3)
    private String p2n34YN;
    @Column(length = 3)
    private String p2n35YN;
    @Column(length = 3)
    private String p2n36YN;
    @Column(length = 3)
    private String p2n37YN;
    @Column(length = 3)
    private String p2n38YN;
    @Column(length = 3)
    private String p2n39YN;
    @Column(length = 3)
    private String p2n40YN;
    @Column(length = 3)
    private String p2n41YN;
    @Column(length = 3)
    private String p2n42YN;
    @Column(length = 3)
    private String p2n43YN;
    @Column(length = 3)
    private String p2n44YN;
    @Column(length = 3)
    private String p2n45YN;
    @Column(length = 3)
    private String p2n46YN;
    @Column(length = 3)
    private String p2n47YN;
    @Column(length = 3)
    private String p2n48YN;
    @Column(length = 3)
    private String p2n49YN;
    @Column(length = 3)
    private String p2n50YN;
    @Column(length = 3)
    private String p2n51YN;
    @Column(length = 3)
    private String p2n52YN;
    @Column(length = 3)
    private String p2n53YN;
    @Column(length = 3)
    private String p2n54YN;
    @Column(length = 3)
    private String p2n55YN;
    @Column(length = 3)
    private String p2n56YN;
    @Column(length = 3)
    private String p2n57YN;
    @Column(length = 3)
    private String p2n58YN;
    @Column(length = 3)
    private String p2n59YN;
    @Column(length = 3)
    private String p2n60YN;
    @Column(length = 3)
    private String p2n61YN;
    @Column(length = 100)
    private String p2n6Note;
    @Column(length = 100)
    private String p2n7Note;
    @Column(length = 100)
    private String p2n8Note;
    @Column(length = 100)
    private String p2n9Note;
    @Column(length = 100)
    private String p2n10Note;
    @Column(length = 100)
    private String p2n11Note;
    @Column(length = 100)
    private String p2n12Note;
    @Column(length = 100)
    private String p2n13Note;
    @Column(length = 100)
    private String p2n14Note;
    @Column(length = 100)
    private String p2n15Note;
    @Column(length = 100)
    private String p2n16Note;
    @Column(length = 100)
    private String p2n17Note;
    @Column(length = 100)
    private String p2n18Note;
    @Column(length = 100)
    private String p2n19Note;
    @Column(length = 100)
    private String p2n20Note;
    @Column(length = 100)
    private String p2n21Note;
    @Column(length = 100)
    private String p2n22Note;
    @Column(length = 100)
    private String p2n23Note;
    @Column(length = 100)
    private String p2n24Note;
    @Column(length = 100)
    private String p2n25Note;
    @Column(length = 100)
    private String p2n26Note;
    @Column(length = 100)
    private String p2n27Note;
    @Column(length = 100)
    private String p2n28Note;
    @Column(length = 100)
    private String p2n29Note;
    @Column(length = 100)
    private String p2n30Note;
    @Column(length = 100)
    private String p2n31Note;
    @Column(length = 100)
    private String p2n32Note;
    @Column(length = 100)
    private String p2n33Note;
    @Column(length = 100)
    private String p2n34Note;
    @Column(length = 100)
    private String p2n35Note;
    @Column(length = 100)
    private String p2n36Note;
    @Column(length = 100)
    private String p2n37Note;
    @Column(length = 100)
    private String p2n38Note;
    @Column(length = 100)
    private String p2n39Note;
    @Column(length = 100)
    private String p2n40Note;
    @Column(length = 100)
    private String p2n41Note;
    @Column(length = 100)
    private String p2n42Note;
    @Column(length = 100)
    private String p2n43Note;
    @Column(length = 100)
    private String p2n44Note;
    @Column(length = 100)
    private String p2n45Note;
    @Column(length = 100)
    private String p2n46Note;
    @Column(length = 100)
    private String p2n47Note;
    @Column(length = 100)
    private String p2n48Note;
    @Column(length = 100)
    private String p2n49Note;
    @Column(length = 100)
    private String p2n50Note;
    @Column(length = 100)
    private String p2n51Note;
    @Column(length = 100)
    private String p2n52Note;
    @Column(length = 100)
    private String p2n53Note;
    @Column(length = 100)
    private String p2n54Note;
    @Column(length = 100)
    private String p2n55Note;
    @Column(length = 100)
    private String p2n56Note;
    @Column(length = 100)
    private String p2n57Note;
    @Column(length = 100)
    private String p2n58Note;
    @Column(length = 100)
    private String p2n59Note;
    @Column(length = 100)
    private String p2n60Note;
    @Column(length = 100)
    private String p2n61Note;
    // page 3
    @Column(length = 3)
    private String medicineYN; //yes no
    @Column(length = 3)
    private String anticoagulantsYN;//yes no
    @Column(length = 3)
    private String tranquilizersYN;
    @Column(length = 3)
    private String cortisoneYN;
    @Column(length = 100)
    private String medicationP3;
    @Column(length = 3)
    private String allergyMedicationYN;
    @Column(length = 3)
    private String allergyAnestheticsYN;
    @Column(length = 3)
    private String penicillinYN;
    @Column(length = 3)
    private String sulfaYN;
    @Column(length = 3)
    private String antibioticsYN;
    @Column(length = 3)
    private String sodiumYN;
    @Column(length = 3)
    private String aspirinYN;
    @Column(length = 3)
    private String codeineYN;
    @Column(length = 3)
    private String otherMedicationYN;
    @Column(length = 3)
    private String allergyDrugYN;
    @Column(length = 200)
    private String otherMedicationList;
    @Column(length = 200)
    private String allergyDrugList;
    @Column(length = 50)
    private String period;
    @Column(length = 3)
    private String birthControlYN;
    @Column(length = 3)
    private String pregnantYN;
    @Column(length = 20)
    private String deliveryDate;
    @Column(length = 3)
    private String nursingYN;
    @Column(length = 3)
    private String otherConditionYN;
    @Column(length = 3)
    private String cancerYN;
    @Column(length = 3)
    private String diabetesYN;
    @Column(length = 3)
    private String heartDiseaseYN;
    @Column(length = 3)
    private String anestheticProblemYN;
    @Column(length = 50)
    private String signature3_1;
    @Column(length = 50)
    private String date3_1;
    @Column(length = 50)
    private String reviewedBy3;
    @Column(length = 50)
    private String date3_2;
    @Column(length = 50)
    private String signature3_2;
    @Column(length = 50)
    private String operatingDoctor;
    @Column(length = 50)
    private String witness;

    //page 4
    @Column(length = 500)
    private String operation4;




    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getBusTel() {
        return busTel;
    }

    public void setBusTel(String busTel) {
        this.busTel = busTel;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getDentist() {
        return dentist;
    }

    public void setDentist(String dentist) {
        this.dentist = dentist;
    }

    public String getReferBy() {
        return referBy;
    }

    public void setReferBy(String referBy) {
        this.referBy = referBy;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getPersonrelated() {
        return personrelated;
    }

    public void setPersonrelated(String personrelated) {
        this.personrelated = personrelated;
    }

    public String getRelatedPersonName() {
        return relatedPersonName;
    }

    public void setRelatedPersonName(String relatedPersonName) {
        this.relatedPersonName = relatedPersonName;
    }

    public String getRelatedPersonBirthday() {
        return relatedPersonBirthday;
    }

    public void setRelatedPersonBirthday(String relatedPersonBirthday) {
        this.relatedPersonBirthday = relatedPersonBirthday;
    }

    public String getRelatedPersonSSN() {
        return relatedPersonSSN;
    }

    public void setRelatedPersonSSN(String relatedPersonSSN) {
        this.relatedPersonSSN = relatedPersonSSN;
    }

    public String getRelatedPersonHomeTel() {
        return relatedPersonHomeTel;
    }

    public void setRelatedPersonHomeTel(String relatedPersonHomeTel) {
        this.relatedPersonHomeTel = relatedPersonHomeTel;
    }

    public String getRelatedPersonCell() {
        return relatedPersonCell;
    }

    public void setRelatedPersonCell(String relatedPersonCell) {
        this.relatedPersonCell = relatedPersonCell;
    }

    public String getRelatedPersonStreet() {
        return relatedPersonStreet;
    }

    public void setRelatedPersonStreet(String relatedPersonStreet) {
        this.relatedPersonStreet = relatedPersonStreet;
    }

    public String getRelatedPersonCity() {
        return relatedPersonCity;
    }

    public void setRelatedPersonCity(String relatedPersonCity) {
        this.relatedPersonCity = relatedPersonCity;
    }

    public String getRelatedPersonState() {
        return relatedPersonState;
    }

    public void setRelatedPersonState(String relatedPersonState) {
        this.relatedPersonState = relatedPersonState;
    }

    public String getRelatedPersonZip() {
        return relatedPersonZip;
    }

    public void setRelatedPersonZip(String relatedPersonZip) {
        this.relatedPersonZip = relatedPersonZip;
    }

    public String getRelatedPersonEmployer() {
        return relatedPersonEmployer;
    }

    public void setRelatedPersonEmployer(String relatedPersonEmployer) {
        this.relatedPersonEmployer = relatedPersonEmployer;
    }

    public String getRelatedPersonEmployerTel() {
        return relatedPersonEmployerTel;
    }

    public void setRelatedPersonEmployerTel(String relatedPersonEmployerTel) {
        this.relatedPersonEmployerTel = relatedPersonEmployerTel;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerStreet() {
        return employerStreet;
    }

    public void setEmployerStreet(String employerStreet) {
        this.employerStreet = employerStreet;
    }

    public String getEmployerCity() {
        return employerCity;
    }

    public void setEmployerCity(String employerCity) {
        this.employerCity = employerCity;
    }

    public String getEmployerState() {
        return employerState;
    }

    public void setEmployerState(String employerState) {
        this.employerState = employerState;
    }

    public String getEmployerZip() {
        return employerZip;
    }

    public void setEmployerZip(String employerZip) {
        this.employerZip = employerZip;
    }

    public String getSigneDate() {
        return signeDate;
    }

    public void setSigneDate(String signeDate) {
        this.signeDate = signeDate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getReasonForVisit2() {
        return reasonForVisit2;
    }

    public void setReasonForVisit2(String reasonForVisit2) {
        this.reasonForVisit2 = reasonForVisit2;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getInHealthYN() {
        return inHealthYN;
    }

    public void setInHealthYN(String inHealthYN) {
        this.inHealthYN = inHealthYN;
    }

    public String getChangeInHealthYN() {
        return changeInHealthYN;
    }

    public void setChangeInHealthYN(String changeInHealthYN) {
        this.changeInHealthYN = changeInHealthYN;
    }

    public String getUnderPhysicianYN() {
        return underPhysicianYN;
    }

    public void setUnderPhysicianYN(String underPhysicianYN) {
        this.underPhysicianYN = underPhysicianYN;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public String getIllnessYN() {
        return illnessYN;
    }

    public void setIllnessYN(String illnessYN) {
        this.illnessYN = illnessYN;
    }

    public String getInjuryWhere() {
        return injuryWhere;
    }

    public void setInjuryWhere(String injuryWhere) {
        this.injuryWhere = injuryWhere;
    }

    public String getInjuryYN() {
        return injuryYN;
    }

    public void setInjuryYN(String injuryYN) {
        this.injuryYN = injuryYN;
    }

    public String getP2n6YN() {
        return p2n6YN;
    }

    public void setP2n6YN(String p2n6YN) {
        this.p2n6YN = p2n6YN;
    }

    public String getP2n7YN() {
        return p2n7YN;
    }

    public void setP2n7YN(String p2n7YN) {
        this.p2n7YN = p2n7YN;
    }

    public String getP2n8YN() {
        return p2n8YN;
    }

    public void setP2n8YN(String p2n8YN) {
        this.p2n8YN = p2n8YN;
    }

    public String getP2n9YN() {
        return p2n9YN;
    }

    public void setP2n9YN(String p2n9YN) {
        this.p2n9YN = p2n9YN;
    }

    public String getP2n10YN() {
        return p2n10YN;
    }

    public void setP2n10YN(String p2n10YN) {
        this.p2n10YN = p2n10YN;
    }

    public String getP2n11YN() {
        return p2n11YN;
    }

    public void setP2n11YN(String p2n11YN) {
        this.p2n11YN = p2n11YN;
    }

    public String getP2n12YN() {
        return p2n12YN;
    }

    public void setP2n12YN(String p2n12YN) {
        this.p2n12YN = p2n12YN;
    }

    public String getP2n13YN() {
        return p2n13YN;
    }

    public void setP2n13YN(String p2n13YN) {
        this.p2n13YN = p2n13YN;
    }

    public String getP2n14YN() {
        return p2n14YN;
    }

    public void setP2n14YN(String p2n14YN) {
        this.p2n14YN = p2n14YN;
    }

    public String getP2n15YN() {
        return p2n15YN;
    }

    public void setP2n15YN(String p2n15YN) {
        this.p2n15YN = p2n15YN;
    }

    public String getP2n16YN() {
        return p2n16YN;
    }

    public void setP2n16YN(String p2n16YN) {
        this.p2n16YN = p2n16YN;
    }

    public String getP2n17YN() {
        return p2n17YN;
    }

    public void setP2n17YN(String p2n17YN) {
        this.p2n17YN = p2n17YN;
    }

    public String getP2n18YN() {
        return p2n18YN;
    }

    public void setP2n18YN(String p2n18YN) {
        this.p2n18YN = p2n18YN;
    }

    public String getP2n19YN() {
        return p2n19YN;
    }

    public void setP2n19YN(String p2n19YN) {
        this.p2n19YN = p2n19YN;
    }

    public String getP2n20YN() {
        return p2n20YN;
    }

    public void setP2n20YN(String p2n20YN) {
        this.p2n20YN = p2n20YN;
    }

    public String getP2n21YN() {
        return p2n21YN;
    }

    public void setP2n21YN(String p2n21YN) {
        this.p2n21YN = p2n21YN;
    }

    public String getP2n22YN() {
        return p2n22YN;
    }

    public void setP2n22YN(String p2n22YN) {
        this.p2n22YN = p2n22YN;
    }

    public String getP2n23YN() {
        return p2n23YN;
    }

    public void setP2n23YN(String p2n23YN) {
        this.p2n23YN = p2n23YN;
    }

    public String getP2n24YN() {
        return p2n24YN;
    }

    public void setP2n24YN(String p2n24YN) {
        this.p2n24YN = p2n24YN;
    }

    public String getP2n25YN() {
        return p2n25YN;
    }

    public void setP2n25YN(String p2n25YN) {
        this.p2n25YN = p2n25YN;
    }

    public String getP2n26YN() {
        return p2n26YN;
    }

    public void setP2n26YN(String p2n26YN) {
        this.p2n26YN = p2n26YN;
    }

    public String getP2n27YN() {
        return p2n27YN;
    }

    public void setP2n27YN(String p2n27YN) {
        this.p2n27YN = p2n27YN;
    }

    public String getP2n28YN() {
        return p2n28YN;
    }

    public void setP2n28YN(String p2n28YN) {
        this.p2n28YN = p2n28YN;
    }

    public String getP2n29YN() {
        return p2n29YN;
    }

    public void setP2n29YN(String p2n29YN) {
        this.p2n29YN = p2n29YN;
    }

    public String getP2n30YN() {
        return p2n30YN;
    }

    public void setP2n30YN(String p2n30YN) {
        this.p2n30YN = p2n30YN;
    }

    public String getP2n31YN() {
        return p2n31YN;
    }

    public void setP2n31YN(String p2n31YN) {
        this.p2n31YN = p2n31YN;
    }

    public String getP2n32YN() {
        return p2n32YN;
    }

    public void setP2n32YN(String p2n32YN) {
        this.p2n32YN = p2n32YN;
    }

    public String getP2n33YN() {
        return p2n33YN;
    }

    public void setP2n33YN(String p2n33YN) {
        this.p2n33YN = p2n33YN;
    }

    public String getP2n34YN() {
        return p2n34YN;
    }

    public void setP2n34YN(String p2n34YN) {
        this.p2n34YN = p2n34YN;
    }

    public String getP2n35YN() {
        return p2n35YN;
    }

    public void setP2n35YN(String p2n35YN) {
        this.p2n35YN = p2n35YN;
    }

    public String getP2n36YN() {
        return p2n36YN;
    }

    public void setP2n36YN(String p2n36YN) {
        this.p2n36YN = p2n36YN;
    }

    public String getP2n37YN() {
        return p2n37YN;
    }

    public void setP2n37YN(String p2n37YN) {
        this.p2n37YN = p2n37YN;
    }

    public String getP2n38YN() {
        return p2n38YN;
    }

    public void setP2n38YN(String p2n38YN) {
        this.p2n38YN = p2n38YN;
    }

    public String getP2n39YN() {
        return p2n39YN;
    }

    public void setP2n39YN(String p2n39YN) {
        this.p2n39YN = p2n39YN;
    }

    public String getP2n40YN() {
        return p2n40YN;
    }

    public void setP2n40YN(String p2n40YN) {
        this.p2n40YN = p2n40YN;
    }

    public String getP2n41YN() {
        return p2n41YN;
    }

    public void setP2n41YN(String p2n41YN) {
        this.p2n41YN = p2n41YN;
    }

    public String getP2n42YN() {
        return p2n42YN;
    }

    public void setP2n42YN(String p2n42YN) {
        this.p2n42YN = p2n42YN;
    }

    public String getP2n43YN() {
        return p2n43YN;
    }

    public void setP2n43YN(String p2n43YN) {
        this.p2n43YN = p2n43YN;
    }

    public String getP2n44YN() {
        return p2n44YN;
    }

    public void setP2n44YN(String p2n44YN) {
        this.p2n44YN = p2n44YN;
    }

    public String getP2n45YN() {
        return p2n45YN;
    }

    public void setP2n45YN(String p2n45YN) {
        this.p2n45YN = p2n45YN;
    }

    public String getP2n46YN() {
        return p2n46YN;
    }

    public void setP2n46YN(String p2n46YN) {
        this.p2n46YN = p2n46YN;
    }

    public String getP2n47YN() {
        return p2n47YN;
    }

    public void setP2n47YN(String p2n47YN) {
        this.p2n47YN = p2n47YN;
    }

    public String getP2n48YN() {
        return p2n48YN;
    }

    public void setP2n48YN(String p2n48YN) {
        this.p2n48YN = p2n48YN;
    }

    public String getP2n49YN() {
        return p2n49YN;
    }

    public void setP2n49YN(String p2n49YN) {
        this.p2n49YN = p2n49YN;
    }

    public String getP2n50YN() {
        return p2n50YN;
    }

    public void setP2n50YN(String p2n50YN) {
        this.p2n50YN = p2n50YN;
    }

    public String getP2n51YN() {
        return p2n51YN;
    }

    public void setP2n51YN(String p2n51YN) {
        this.p2n51YN = p2n51YN;
    }

    public String getP2n52YN() {
        return p2n52YN;
    }

    public void setP2n52YN(String p2n52YN) {
        this.p2n52YN = p2n52YN;
    }

    public String getP2n53YN() {
        return p2n53YN;
    }

    public void setP2n53YN(String p2n53YN) {
        this.p2n53YN = p2n53YN;
    }

    public String getP2n54YN() {
        return p2n54YN;
    }

    public void setP2n54YN(String p2n54YN) {
        this.p2n54YN = p2n54YN;
    }

    public String getP2n55YN() {
        return p2n55YN;
    }

    public void setP2n55YN(String p2n55YN) {
        this.p2n55YN = p2n55YN;
    }

    public String getP2n56YN() {
        return p2n56YN;
    }

    public void setP2n56YN(String p2n56YN) {
        this.p2n56YN = p2n56YN;
    }

    public String getP2n57YN() {
        return p2n57YN;
    }

    public void setP2n57YN(String p2n57YN) {
        this.p2n57YN = p2n57YN;
    }

    public String getP2n58YN() {
        return p2n58YN;
    }

    public void setP2n58YN(String p2n58YN) {
        this.p2n58YN = p2n58YN;
    }

    public String getP2n59YN() {
        return p2n59YN;
    }

    public void setP2n59YN(String p2n59YN) {
        this.p2n59YN = p2n59YN;
    }

    public String getP2n60YN() {
        return p2n60YN;
    }

    public void setP2n60YN(String p2n60YN) {
        this.p2n60YN = p2n60YN;
    }

    public String getP2n61YN() {
        return p2n61YN;
    }

    public void setP2n61YN(String p2n61YN) {
        this.p2n61YN = p2n61YN;
    }

    public String getP2n6Note() {
        return p2n6Note;
    }

    public void setP2n6Note(String p2n6Note) {
        this.p2n6Note = p2n6Note;
    }

    public String getP2n7Note() {
        return p2n7Note;
    }

    public void setP2n7Note(String p2n7Note) {
        this.p2n7Note = p2n7Note;
    }

    public String getP2n8Note() {
        return p2n8Note;
    }

    public void setP2n8Note(String p2n8Note) {
        this.p2n8Note = p2n8Note;
    }

    public String getP2n9Note() {
        return p2n9Note;
    }

    public void setP2n9Note(String p2n9Note) {
        this.p2n9Note = p2n9Note;
    }

    public String getP2n10Note() {
        return p2n10Note;
    }

    public void setP2n10Note(String p2n10Note) {
        this.p2n10Note = p2n10Note;
    }

    public String getP2n11Note() {
        return p2n11Note;
    }

    public void setP2n11Note(String p2n11Note) {
        this.p2n11Note = p2n11Note;
    }

    public String getP2n12Note() {
        return p2n12Note;
    }

    public void setP2n12Note(String p2n12Note) {
        this.p2n12Note = p2n12Note;
    }

    public String getP2n13Note() {
        return p2n13Note;
    }

    public void setP2n13Note(String p2n13Note) {
        this.p2n13Note = p2n13Note;
    }

    public String getP2n14Note() {
        return p2n14Note;
    }

    public void setP2n14Note(String p2n14Note) {
        this.p2n14Note = p2n14Note;
    }

    public String getP2n15Note() {
        return p2n15Note;
    }

    public void setP2n15Note(String p2n15Note) {
        this.p2n15Note = p2n15Note;
    }

    public String getP2n16Note() {
        return p2n16Note;
    }

    public void setP2n16Note(String p2n16Note) {
        this.p2n16Note = p2n16Note;
    }

    public String getP2n17Note() {
        return p2n17Note;
    }

    public void setP2n17Note(String p2n17Note) {
        this.p2n17Note = p2n17Note;
    }

    public String getP2n18Note() {
        return p2n18Note;
    }

    public void setP2n18Note(String p2n18Note) {
        this.p2n18Note = p2n18Note;
    }

    public String getP2n19Note() {
        return p2n19Note;
    }

    public void setP2n19Note(String p2n19Note) {
        this.p2n19Note = p2n19Note;
    }

    public String getP2n20Note() {
        return p2n20Note;
    }

    public void setP2n20Note(String p2n20Note) {
        this.p2n20Note = p2n20Note;
    }

    public String getP2n21Note() {
        return p2n21Note;
    }

    public void setP2n21Note(String p2n21Note) {
        this.p2n21Note = p2n21Note;
    }

    public String getP2n22Note() {
        return p2n22Note;
    }

    public void setP2n22Note(String p2n22Note) {
        this.p2n22Note = p2n22Note;
    }

    public String getP2n23Note() {
        return p2n23Note;
    }

    public void setP2n23Note(String p2n23Note) {
        this.p2n23Note = p2n23Note;
    }

    public String getP2n24Note() {
        return p2n24Note;
    }

    public void setP2n24Note(String p2n24Note) {
        this.p2n24Note = p2n24Note;
    }

    public String getP2n25Note() {
        return p2n25Note;
    }

    public void setP2n25Note(String p2n25Note) {
        this.p2n25Note = p2n25Note;
    }

    public String getP2n26Note() {
        return p2n26Note;
    }

    public void setP2n26Note(String p2n26Note) {
        this.p2n26Note = p2n26Note;
    }

    public String getP2n27Note() {
        return p2n27Note;
    }

    public void setP2n27Note(String p2n27Note) {
        this.p2n27Note = p2n27Note;
    }

    public String getP2n28Note() {
        return p2n28Note;
    }

    public void setP2n28Note(String p2n28Note) {
        this.p2n28Note = p2n28Note;
    }

    public String getP2n29Note() {
        return p2n29Note;
    }

    public void setP2n29Note(String p2n29Note) {
        this.p2n29Note = p2n29Note;
    }

    public String getP2n30Note() {
        return p2n30Note;
    }

    public void setP2n30Note(String p2n30Note) {
        this.p2n30Note = p2n30Note;
    }

    public String getP2n31Note() {
        return p2n31Note;
    }

    public void setP2n31Note(String p2n31Note) {
        this.p2n31Note = p2n31Note;
    }

    public String getP2n32Note() {
        return p2n32Note;
    }

    public void setP2n32Note(String p2n32Note) {
        this.p2n32Note = p2n32Note;
    }

    public String getP2n33Note() {
        return p2n33Note;
    }

    public void setP2n33Note(String p2n33Note) {
        this.p2n33Note = p2n33Note;
    }

    public String getP2n34Note() {
        return p2n34Note;
    }

    public void setP2n34Note(String p2n34Note) {
        this.p2n34Note = p2n34Note;
    }

    public String getP2n35Note() {
        return p2n35Note;
    }

    public void setP2n35Note(String p2n35Note) {
        this.p2n35Note = p2n35Note;
    }

    public String getP2n36Note() {
        return p2n36Note;
    }

    public void setP2n36Note(String p2n36Note) {
        this.p2n36Note = p2n36Note;
    }

    public String getP2n37Note() {
        return p2n37Note;
    }

    public void setP2n37Note(String p2n37Note) {
        this.p2n37Note = p2n37Note;
    }

    public String getP2n38Note() {
        return p2n38Note;
    }

    public void setP2n38Note(String p2n38Note) {
        this.p2n38Note = p2n38Note;
    }

    public String getP2n39Note() {
        return p2n39Note;
    }

    public void setP2n39Note(String p2n39Note) {
        this.p2n39Note = p2n39Note;
    }

    public String getP2n40Note() {
        return p2n40Note;
    }

    public void setP2n40Note(String p2n40Note) {
        this.p2n40Note = p2n40Note;
    }

    public String getP2n41Note() {
        return p2n41Note;
    }

    public void setP2n41Note(String p2n41Note) {
        this.p2n41Note = p2n41Note;
    }

    public String getP2n42Note() {
        return p2n42Note;
    }

    public void setP2n42Note(String p2n42Note) {
        this.p2n42Note = p2n42Note;
    }

    public String getP2n43Note() {
        return p2n43Note;
    }

    public void setP2n43Note(String p2n43Note) {
        this.p2n43Note = p2n43Note;
    }

    public String getP2n44Note() {
        return p2n44Note;
    }

    public void setP2n44Note(String p2n44Note) {
        this.p2n44Note = p2n44Note;
    }

    public String getP2n45Note() {
        return p2n45Note;
    }

    public void setP2n45Note(String p2n45Note) {
        this.p2n45Note = p2n45Note;
    }

    public String getP2n46Note() {
        return p2n46Note;
    }

    public void setP2n46Note(String p2n46Note) {
        this.p2n46Note = p2n46Note;
    }

    public String getP2n47Note() {
        return p2n47Note;
    }

    public void setP2n47Note(String p2n47Note) {
        this.p2n47Note = p2n47Note;
    }

    public String getP2n48Note() {
        return p2n48Note;
    }

    public void setP2n48Note(String p2n48Note) {
        this.p2n48Note = p2n48Note;
    }

    public String getP2n49Note() {
        return p2n49Note;
    }

    public void setP2n49Note(String p2n49Note) {
        this.p2n49Note = p2n49Note;
    }

    public String getP2n50Note() {
        return p2n50Note;
    }

    public void setP2n50Note(String p2n50Note) {
        this.p2n50Note = p2n50Note;
    }

    public String getP2n51Note() {
        return p2n51Note;
    }

    public void setP2n51Note(String p2n51Note) {
        this.p2n51Note = p2n51Note;
    }

    public String getP2n52Note() {
        return p2n52Note;
    }

    public void setP2n52Note(String p2n52Note) {
        this.p2n52Note = p2n52Note;
    }

    public String getP2n53Note() {
        return p2n53Note;
    }

    public void setP2n53Note(String p2n53Note) {
        this.p2n53Note = p2n53Note;
    }

    public String getP2n54Note() {
        return p2n54Note;
    }

    public void setP2n54Note(String p2n54Note) {
        this.p2n54Note = p2n54Note;
    }

    public String getP2n55Note() {
        return p2n55Note;
    }

    public void setP2n55Note(String p2n55Note) {
        this.p2n55Note = p2n55Note;
    }

    public String getP2n56Note() {
        return p2n56Note;
    }

    public void setP2n56Note(String p2n56Note) {
        this.p2n56Note = p2n56Note;
    }

    public String getP2n57Note() {
        return p2n57Note;
    }

    public void setP2n57Note(String p2n57Note) {
        this.p2n57Note = p2n57Note;
    }

    public String getP2n58Note() {
        return p2n58Note;
    }

    public void setP2n58Note(String p2n58Note) {
        this.p2n58Note = p2n58Note;
    }

    public String getP2n59Note() {
        return p2n59Note;
    }

    public void setP2n59Note(String p2n59Note) {
        this.p2n59Note = p2n59Note;
    }

    public String getP2n60Note() {
        return p2n60Note;
    }

    public void setP2n60Note(String p2n60Note) {
        this.p2n60Note = p2n60Note;
    }

    public String getP2n61Note() {
        return p2n61Note;
    }

    public void setP2n61Note(String p2n61Note) {
        this.p2n61Note = p2n61Note;
    }

    public String getEmployerTel() {
        return employerTel;
    }

    public void setEmployerTel(String employerTel) {
        this.employerTel = employerTel;
    }

    public String getMedicineYN() {
        return medicineYN;
    }

    public void setMedicineYN(String medicineYN) {
        this.medicineYN = medicineYN;
    }

    public String getAnticoagulantsYN() {
        return anticoagulantsYN;
    }

    public void setAnticoagulantsYN(String anticoagulantsYN) {
        this.anticoagulantsYN = anticoagulantsYN;
    }

    public String getTranquilizersYN() {
        return tranquilizersYN;
    }

    public void setTranquilizersYN(String tranquilizersYN) {
        this.tranquilizersYN = tranquilizersYN;
    }

    public String getCortisoneYN() {
        return cortisoneYN;
    }

    public void setCortisoneYN(String cortisoneYN) {
        this.cortisoneYN = cortisoneYN;
    }

    public String getMedicationP3() {
        return medicationP3;
    }

    public void setMedicationP3(String medicationP3) {
        this.medicationP3 = medicationP3;
    }

    public String getAllergyMedicationYN() {
        return allergyMedicationYN;
    }

    public void setAllergyMedicationYN(String allergyMedicationYN) {
        this.allergyMedicationYN = allergyMedicationYN;
    }

    public String getAllergyAnestheticsYN() {
        return allergyAnestheticsYN;
    }

    public void setAllergyAnestheticsYN(String allergyAnestheticsYN) {
        this.allergyAnestheticsYN = allergyAnestheticsYN;
    }

    public String getPenicillinYN() {
        return penicillinYN;
    }

    public void setPenicillinYN(String penicillinYN) {
        this.penicillinYN = penicillinYN;
    }

    public String getSulfaYN() {
        return sulfaYN;
    }

    public void setSulfaYN(String sulfaYN) {
        this.sulfaYN = sulfaYN;
    }

    public String getAntibioticsYN() {
        return antibioticsYN;
    }

    public void setAntibioticsYN(String antibioticsYN) {
        this.antibioticsYN = antibioticsYN;
    }

    public String getSodiumYN() {
        return sodiumYN;
    }

    public void setSodiumYN(String sodiumYN) {
        this.sodiumYN = sodiumYN;
    }

    public String getAspirinYN() {
        return aspirinYN;
    }

    public void setAspirinYN(String aspirinYN) {
        this.aspirinYN = aspirinYN;
    }

    public String getCodeineYN() {
        return codeineYN;
    }

    public void setCodeineYN(String codeineYN) {
        this.codeineYN = codeineYN;
    }

    public String getOtherMedicationYN() {
        return otherMedicationYN;
    }

    public void setOtherMedicationYN(String otherMedicationYN) {
        this.otherMedicationYN = otherMedicationYN;
    }

    public String getAllergyDrugYN() {
        return allergyDrugYN;
    }

    public void setAllergyDrugYN(String allergyDrugYN) {
        this.allergyDrugYN = allergyDrugYN;
    }

    public String getOtherMedicationList() {
        return otherMedicationList;
    }

    public void setOtherMedicationList(String otherMedicationList) {
        this.otherMedicationList = otherMedicationList;
    }

    public String getAllergyDrugList() {
        return allergyDrugList;
    }

    public void setAllergyDrugList(String allergyDrugList) {
        this.allergyDrugList = allergyDrugList;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getBirthControlYN() {
        return birthControlYN;
    }

    public void setBirthControlYN(String birthControlYN) {
        this.birthControlYN = birthControlYN;
    }

    public String getPregnantYN() {
        return pregnantYN;
    }

    public void setPregnantYN(String pregnantYN) {
        this.pregnantYN = pregnantYN;
    }

    public String getNursingYN() {
        return nursingYN;
    }

    public void setNursingYN(String nursingYN) {
        this.nursingYN = nursingYN;
    }

    public String getOtherConditionYN() {
        return otherConditionYN;
    }

    public void setOtherConditionYN(String otherConditionYN) {
        this.otherConditionYN = otherConditionYN;
    }

    public String getCancerYN() {
        return cancerYN;
    }

    public void setCancerYN(String cancerYN) {
        this.cancerYN = cancerYN;
    }

    public String getDiabetesYN() {
        return diabetesYN;
    }

    public void setDiabetesYN(String diabetesYN) {
        this.diabetesYN = diabetesYN;
    }

    public String getHeartDiseaseYN() {
        return heartDiseaseYN;
    }

    public void setHeartDiseaseYN(String heartDiseaseYN) {
        this.heartDiseaseYN = heartDiseaseYN;
    }

    public String getAnestheticProblemYN() {
        return anestheticProblemYN;
    }

    public void setAnestheticProblemYN(String anestheticProblemYN) {
        this.anestheticProblemYN = anestheticProblemYN;
    }

    public String getSignature3_1() {
        return signature3_1;
    }

    public void setSignature3_1(String signature3_1) {
        this.signature3_1 = signature3_1;
    }

    public String getDate3_1() {
        return date3_1;
    }

    public void setDate3_1(String date3_1) {
        this.date3_1 = date3_1;
    }

    public String getReviewedBy3() {
        return reviewedBy3;
    }

    public void setReviewedBy3(String reviewedBy3) {
        this.reviewedBy3 = reviewedBy3;
    }

    public String getDate3_2() {
        return date3_2;
    }

    public void setDate3_2(String date3_2) {
        this.date3_2 = date3_2;
    }

    public String getSignature3_2() {
        return signature3_2;
    }

    public void setSignature3_2(String signature3_2) {
        this.signature3_2 = signature3_2;
    }

    public String getOperatingDoctor() {
        return operatingDoctor;
    }

    public void setOperatingDoctor(String operatingDoctor) {
        this.operatingDoctor = operatingDoctor;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public String getOperation4() {
        return operation4;
    }

    public void setOperation4(String operation4) {
        this.operation4 = operation4;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}

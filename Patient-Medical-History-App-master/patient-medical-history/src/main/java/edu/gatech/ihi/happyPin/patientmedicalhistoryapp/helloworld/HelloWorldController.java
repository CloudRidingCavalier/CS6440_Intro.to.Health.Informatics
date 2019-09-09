package edu.gatech.ihi.happyPin.patientmedicalhistoryapp.helloworld;


import org.hl7.fhir.dstu3.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    Patient patient;

//    @Value("${greeting}")
    private String greeting;
    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        patient = new Patient();
        patient.addName().addGiven("John").setFamily("Doe");
        theModel.addAttribute("patient", patient);
        return "viewpatient";
    }
}

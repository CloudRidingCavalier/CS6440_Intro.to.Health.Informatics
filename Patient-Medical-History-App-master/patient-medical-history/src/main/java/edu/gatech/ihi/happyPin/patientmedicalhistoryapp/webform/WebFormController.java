package edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebFormController {

    @Value("${fhirbase}")
    String fhirbase;

    @Value("${secretkey}")
    String secretkey;


    private final WebFormDataRepository repository;
    @Autowired
    WebFormController(WebFormDataRepository repository) {
        this.repository = repository;
    }



    @PostMapping("/checkkey")
    public String checkKey(@ModelAttribute WebFormData webFormData, Model model) {
        //List<WebFormData> data = new ArrayList<>();
        //WebFormData data1 = repository.findBySsn(webFormData.getSsn());
        String key = webFormData.getFirstName();
        if (secretkey.equals(key)) {
            return "viewpatient";
        } else {
            model.addAttribute("error", "true");
            return "login";
        }
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("webFormData", new WebFormData());
        return "login";
    }



    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("webFormData", new WebFormData());
        return "newpatient";
    }


    @PostMapping("/findbyssn")
    public String getPatientBySSN(@ModelAttribute WebFormData webFormData, Model model) {
        WebFormData data = repository.findBySsn(webFormData.getSsn());
        if (data != null )
            model.addAttribute("webFormData", data);
        return "newpatient";

    }




    @PostMapping("/viewpatient")
    public String viewByFirstName(@ModelAttribute WebFormData webFormData, Model model) {
        WebFormData data = repository.findBySsn(webFormData.getSsn());
        if (data != null )
            model.addAttribute("webFormData", data);
        return "patientdetail";
    }



    @PostMapping("/findbyfirstname")
    public String getPatientByFirstName(@ModelAttribute WebFormData webFormData, Model model) {
        List<WebFormData> data = repository.findByFirstName(webFormData.getFirstName());

        if (data != null )
            model.addAttribute("data", data);
        return "viewpatient";
    }


    @PostMapping("/findbylastname")
    public String getPatientByLastName(@ModelAttribute WebFormData webFormData, Model model) {
        List<WebFormData> data = repository.findByLastName(webFormData.getLastName());

        if (data != null )
            model.addAttribute("data", data);
        return "viewpatient";
    }

    @PostMapping("/findbydateofbirth")
    public String getPatientByDateOfBirth(@ModelAttribute WebFormData webFormData, Model model) {
        List<WebFormData> data = repository.findByDataOfBirth(webFormData.getDataOfBirth());

        if (data != null )
            model.addAttribute("data", data);
        return "viewpatient";
    }

    @PostMapping("/findbyssn1")
    public String getPatientBySSN1(@ModelAttribute WebFormData webFormData, Model model) {
        List<WebFormData> data = new ArrayList<>();
        WebFormData data1 = repository.findBySsn(webFormData.getSsn());
        if (data1 != null ) {
            data.add(data1);
            model.addAttribute("data", data);
        }
        return "viewpatient";

    }







    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("webFormData", new WebFormData());
        return "viewpatient";
    }


    @PostMapping("/submitresult")
    public String newPatientSubmit(@ModelAttribute WebFormData webFormData) {
        FHIRService fhir = new FHIRService(fhirbase);
        WebFormData data = repository.findBySsn(webFormData.getSsn());
        if (data == null) {
            fhir.addPatient(webFormData);
        } else {
            fhir.updatePatient(webFormData);
        }
        repository.save(webFormData);
        return "submitresult";
    }

//    @PostMapping("/submitresult")
//    String newWebFormData(@RequestBody WebFormData newWebFormData) {
//        repository.save(newWebFormData);
//        return "submitresult";
//    }
}

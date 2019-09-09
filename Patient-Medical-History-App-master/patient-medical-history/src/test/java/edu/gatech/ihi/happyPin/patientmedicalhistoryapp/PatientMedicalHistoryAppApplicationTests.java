package edu.gatech.ihi.happyPin.patientmedicalhistoryapp;

import edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform.FHIRService;
import edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform.WebFormData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientMedicalHistoryAppApplicationTests {

	@Test
	public void testUpdatePatientHomePhone() {

		FHIRService updater = new FHIRService("http://hapi.fhir.org/baseDstu3");
		String homePhone = "856-555-1212";
		WebFormData data = new WebFormData();
		data.setHomeTel(homePhone);
		updater.updatePatient(data);
		String getHomePhone = data.getHomeTel();
		//add assertions or visually inspect server
		assertEquals(homePhone, getHomePhone);
	}

}

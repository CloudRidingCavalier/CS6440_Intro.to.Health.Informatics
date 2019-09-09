package edu.gatech.ihi.happyPin.patientmedicalhistoryapp.webform;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WebFormDataRepository extends CrudRepository<WebFormData, Integer> {
//
//    @Query("select p from web_form_data p where p.ssn = :ssn")
//    WebFormData getPatientBySSN(@Param("ssn") String ssn);
//

    WebFormData findBySsn(String ssn);
    List<WebFormData>  findByFirstName(String firstName);
    List<WebFormData>  findByLastName(String lasttname);
    List<WebFormData>  findByDataOfBirth(String dateofbirth);
}
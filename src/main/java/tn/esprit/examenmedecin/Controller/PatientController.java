package tn.esprit.examenmedecin.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenmedecin.Entity.Patient;
import tn.esprit.examenmedecin.Service.Interface.PatientService;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class PatientController {
    PatientService patientService;

    @PutMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
}

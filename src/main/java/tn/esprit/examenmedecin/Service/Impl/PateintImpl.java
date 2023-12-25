package tn.esprit.examenmedecin.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenmedecin.Entity.Patient;
import tn.esprit.examenmedecin.Repository.PatientRepository;
import tn.esprit.examenmedecin.Service.Interface.PatientService;

@AllArgsConstructor
@Service
public class PateintImpl implements PatientService {

    PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}

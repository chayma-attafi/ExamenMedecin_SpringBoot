package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.Patient;

@Repository
public interface PatientRepository  extends JpaRepository<Patient,Long> {
}

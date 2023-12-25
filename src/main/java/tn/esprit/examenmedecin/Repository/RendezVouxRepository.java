package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.RendezVoux;
import tn.esprit.examenmedecin.Entity.Speciality;

import java.util.List;

@Repository
public interface RendezVouxRepository  extends JpaRepository<RendezVoux,Long> {
    List<RendezVoux> findByMedecinCliniqueListIdCliniqueAndMedecinSpeciality(Long idClinique, Speciality speciality);
}

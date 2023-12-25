package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.RendezVoux;

@Repository
public interface RendezVouxRepository  extends JpaRepository<RendezVoux,Long> {
}

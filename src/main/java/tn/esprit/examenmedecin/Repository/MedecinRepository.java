package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.Medecin;

@Repository
public interface MedecinRepository  extends JpaRepository<Medecin,Long> {
}

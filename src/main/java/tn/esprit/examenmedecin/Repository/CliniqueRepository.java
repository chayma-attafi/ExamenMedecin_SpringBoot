package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.Clinique;

@Repository
public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}

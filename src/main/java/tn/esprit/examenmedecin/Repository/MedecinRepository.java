package tn.esprit.examenmedecin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examenmedecin.Entity.Medecin;

import java.util.Date;

@Repository
public interface MedecinRepository  extends JpaRepository<Medecin,Long> {
    @Query("SELECT SUM(m.PrixConsultation) From Medecin m join m.rendezVouxList rdvs WHERE rdvs.dateRDV BETWEEN :sDate AND :eDate AND m.idMedecin = :id")
    int getRevenuMedecin(@Param("id") Long idMedecin,
                         @Param("sDate") Date startDate,
                         @Param("eDate") Date endDate);

}

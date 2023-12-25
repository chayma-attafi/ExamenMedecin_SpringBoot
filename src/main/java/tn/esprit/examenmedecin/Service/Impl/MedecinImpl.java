package tn.esprit.examenmedecin.Service.Impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenmedecin.Entity.Clinique;
import tn.esprit.examenmedecin.Entity.Medecin;
import tn.esprit.examenmedecin.Entity.RendezVoux;
import tn.esprit.examenmedecin.Repository.CliniqueRepository;
import tn.esprit.examenmedecin.Repository.MedecinRepository;
import tn.esprit.examenmedecin.Repository.RendezVouxRepository;
import tn.esprit.examenmedecin.Service.Interface.MedecinService;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class MedecinImpl implements MedecinService {

    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;

    RendezVouxRepository rendezVouxRepository;
    @Transactional
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        medecinRepository.save(medecin);
        Clinique c = cliniqueRepository.findById(cliniqueId).orElse(null);

        //affecter medecin a Clinique
        c.getMedecinList().add(medecin);

        cliniqueRepository.save(c);

        return null;
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
    Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);

        return medecin.getRendezVouxList().size();
    }

    @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate) {
       int revenu =medecinRepository.getRevenuMedecin(idMedecin,startDate,endDate);
        return revenu;
    }
}

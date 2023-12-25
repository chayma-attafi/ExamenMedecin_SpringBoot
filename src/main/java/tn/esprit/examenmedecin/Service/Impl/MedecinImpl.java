package tn.esprit.examenmedecin.Service.Impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenmedecin.Entity.Clinique;
import tn.esprit.examenmedecin.Entity.Medecin;
import tn.esprit.examenmedecin.Repository.CliniqueRepository;
import tn.esprit.examenmedecin.Repository.MedecinRepository;
import tn.esprit.examenmedecin.Service.Interface.MedecinService;

@AllArgsConstructor
@Service
public class MedecinImpl implements MedecinService {

    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;

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
}

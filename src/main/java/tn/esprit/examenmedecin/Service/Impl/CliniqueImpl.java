package tn.esprit.examenmedecin.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenmedecin.Entity.Clinique;
import tn.esprit.examenmedecin.Repository.CliniqueRepository;
import tn.esprit.examenmedecin.Service.Interface.CliniqueService;

@AllArgsConstructor
@Service
public class CliniqueImpl implements CliniqueService{
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }

}

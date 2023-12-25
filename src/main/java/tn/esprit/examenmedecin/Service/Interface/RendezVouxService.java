package tn.esprit.examenmedecin.Service.Interface;

import tn.esprit.examenmedecin.Entity.RendezVoux;
import tn.esprit.examenmedecin.Entity.Speciality;

import java.util.List;

public interface RendezVouxService {
    public void addRDVAndAssignMedAndPatient(RendezVoux rdv, Long idMedecin, Long
            idPatient);
    public List<RendezVoux> getRendezVousByCliniqueAndSpecialite(Long idClinique, Speciality specialite);
    public void retrieveRendezVous();
}

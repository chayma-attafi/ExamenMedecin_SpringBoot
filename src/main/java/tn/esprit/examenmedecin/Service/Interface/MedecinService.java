package tn.esprit.examenmedecin.Service.Interface;

import tn.esprit.examenmedecin.Entity.Medecin;

import java.util.Date;

public interface MedecinService {
    public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId);
    public int getNbrRendezVousMedecin(Long idMedecin);
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate);
}

package tn.esprit.examenmedecin.Service.Interface;

import tn.esprit.examenmedecin.Entity.Medecin;

public interface MedecinService {
    public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId);
}

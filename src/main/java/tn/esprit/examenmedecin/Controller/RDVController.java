package tn.esprit.examenmedecin.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenmedecin.Entity.RendezVoux;
import tn.esprit.examenmedecin.Entity.Speciality;
import tn.esprit.examenmedecin.Service.Interface.RendezVouxService;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class RDVController {
    RendezVouxService rendezVouxService;

    @PutMapping("/addRDVAndAssignMedAndPatient/{idMedecin}/{idPatient}")
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVoux rdv,
                                             @PathVariable("idMedecin") Long idMedecin,
                                             @PathVariable("idPatient") Long idPatient) {
        rendezVouxService.addRDVAndAssignMedAndPatient(rdv, idMedecin, idPatient);
    }

    @GetMapping("/getRendezVousByCliniqueAndSpecialite/{idClinique}/{specialite}")
    public List<RendezVoux> getRendezVousByCliniqueAndSpecialite(@PathVariable Long idClinique,
                                                                 @PathVariable Speciality specialite) {
        return rendezVouxService.getRendezVousByCliniqueAndSpecialite(idClinique, specialite);
    }

    @GetMapping("/retrieveRendezVous")
    public void retrieveRendezVous() {
        rendezVouxService.retrieveRendezVous();
    }
}

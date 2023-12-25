package tn.esprit.examenmedecin.Controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenmedecin.Entity.Medecin;
import tn.esprit.examenmedecin.Service.Interface.MedecinService;

import java.util.Date;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class MedecinController {

    MedecinService medecinService;

    @ResponseBody
    @PutMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin,
                                                 @PathVariable("cliniqueId") Long cliniqueId) {
        return medecinService.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }

    @GetMapping("/getNbrRendezVousMedecin/{idMedecin}")
    public int getNbrRendezVousMedecin(@PathVariable Long idMedecin) {
        return medecinService.getNbrRendezVousMedecin(idMedecin);
    }

    @GetMapping("/getRevenuMedecin/{idMedecin}/{startDate}/{endDate}")
    public int getRevenuMedecin(@PathVariable("idMedecin") Long idMedecin,
                                @PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                @PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd")Date endDate) {
        return medecinService.getRevenuMedecin(idMedecin, startDate, endDate);
    }
}

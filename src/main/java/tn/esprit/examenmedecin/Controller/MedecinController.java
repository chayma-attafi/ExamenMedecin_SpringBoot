package tn.esprit.examenmedecin.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenmedecin.Entity.Medecin;
import tn.esprit.examenmedecin.Service.Interface.MedecinService;

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
}

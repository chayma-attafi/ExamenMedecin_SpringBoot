package tn.esprit.examenmedecin.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenmedecin.Entity.Clinique;
import tn.esprit.examenmedecin.Service.Interface.CliniqueService;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class CliniqueController {
    CliniqueService cliniqueService;

    @PutMapping("/addClinique")
    public Clinique addClinique(@RequestBody Clinique clinique) {
        return cliniqueService.addClinique(clinique);
    }
}

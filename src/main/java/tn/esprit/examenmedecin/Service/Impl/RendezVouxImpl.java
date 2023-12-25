package tn.esprit.examenmedecin.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenmedecin.Entity.*;
import tn.esprit.examenmedecin.Repository.CliniqueRepository;
import tn.esprit.examenmedecin.Repository.MedecinRepository;
import tn.esprit.examenmedecin.Repository.PatientRepository;
import tn.esprit.examenmedecin.Repository.RendezVouxRepository;
import tn.esprit.examenmedecin.Service.Interface.RendezVouxService;

import java.util.Date;
import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class RendezVouxImpl implements RendezVouxService {

    RendezVouxRepository rendezVouxRepository;
    MedecinRepository medecinRepository;
    PatientRepository patientRepository;
    CliniqueRepository cliniqueRepository;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVoux rdv, Long idMedecin, Long idPatient) {

        Medecin m = medecinRepository.findById(idMedecin).orElse(null);
        Patient p = patientRepository.findById(idPatient).orElse(null);

        rdv.setPatient(p);
        rdv.setMedecin(m);
        rendezVouxRepository.save(rdv);

    }

    @Override
    public List<RendezVoux> getRendezVousByCliniqueAndSpecialite(Long idClinique, Speciality specialite) {
        return rendezVouxRepository.findByMedecinCliniqueListIdCliniqueAndMedecinSpeciality(idClinique,specialite);
    }
    //@Scheduled(cron = "30 * * * * *") lena twali tji 9bal matsir fi terminal

    @Scheduled(cron = "*/30 * * * * *")
    @Override
    public void retrieveRendezVous() {
        for(RendezVoux r : rendezVouxRepository.findAll()){
            if(r.getDateRDV().after(new Date())){
                log.info("RendezVous : " + r.getDateRDV() +
                        " : Medecin : " + r.getMedecin().getIdMedecin() +
                        " : Patient : " + r.getPatient().getNomPatiennt());
            }
        }
    }





}

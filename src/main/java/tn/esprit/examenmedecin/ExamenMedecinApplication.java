package tn.esprit.examenmedecin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ExamenMedecinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenMedecinApplication.class, args);
    }

}

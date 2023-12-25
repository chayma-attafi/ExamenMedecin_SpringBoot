package tn.esprit.examenmedecin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Clinique")
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idClinique")
    long idClinique;
    String NomClinique,Adresse;
    int telephone;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany
    List<Medecin> medecinList=new ArrayList<>();

}

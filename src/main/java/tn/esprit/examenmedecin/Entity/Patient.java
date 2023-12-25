package tn.esprit.examenmedecin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idPatient")
    long idPatient;
    String NomPatiennt;
    int telephone;

    @Temporal(TemporalType.DATE)
    Date dateDeNaissance;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "patient")
    List<RendezVoux> rendezVouxList=new ArrayList<>();

}

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
@Table(name = "Medecin")
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idMedecin")
    long idMedecin;

    @Enumerated(EnumType.STRING)
    Speciality speciality;
    int telephone,PrixConsultation;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "medecinList", cascade =   CascadeType.ALL)
    List<Clinique> cliniqueList=new ArrayList<>();

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "medecin")
    List<RendezVoux> rendezVouxList=new ArrayList<>();


}

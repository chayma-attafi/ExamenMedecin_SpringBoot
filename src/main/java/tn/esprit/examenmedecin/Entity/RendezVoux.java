package tn.esprit.examenmedecin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "RendezVoux")
public class RendezVoux implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idRendezVoux")
    long idRendezVoux;

    @Temporal(TemporalType.DATE)
    Date dateRDV;

    String Remarque;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Medecin medecin;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Patient patient;
}

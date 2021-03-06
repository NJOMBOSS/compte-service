package org.sid.compteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.compteservice.enums.TypeCompte;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private double solde;

    private Date dateCreation;

    @Enumerated(EnumType.STRING) // Va stocker les données sous forme de chaîne de caractères
    private TypeCompte typeCompte;
}

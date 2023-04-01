package com.example.commandes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
    @Column
    private String telephone;


    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Commande> commandes;

    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", telephone="
                + telephone + "]";
    }
}
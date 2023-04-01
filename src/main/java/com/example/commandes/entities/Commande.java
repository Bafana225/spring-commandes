package com.example.commandes.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private LocalDate dateCommande;
    @Column
    private Double montantTotal;



    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}

package com.example.commandes.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Double montantTotal;

    public Commande() {
        super();
    }

    public Commande(long idCommande, LocalDate dateCommande, Double montantTotal) {
        super();
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.montantTotal = montantTotal;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters and setters

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long id) {
        this.idCommande = id;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande [id=" + idCommande + ", dateCommande=" + dateCommande + ", montantTotal=" + montantTotal + "]";
    }
}

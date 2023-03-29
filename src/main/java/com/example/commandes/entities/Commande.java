package com.example.commandes.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

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

    public Commande() {
        super();
    }

    public Commande(long id, LocalDate dateCommande, Double montantTotal) {
        super();
        this.id = id;
        this.dateCommande = dateCommande;
        this.montantTotal = montantTotal;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", montantTotal=" + montantTotal + "]";
    }
}

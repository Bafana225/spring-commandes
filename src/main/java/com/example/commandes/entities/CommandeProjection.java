package com.example.commandes.entities;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name = "montantTotal", types = { Commande.class })
public interface CommandeProjection {
    public Double getMontantTotal();
    public LocalDate getDateCommande();
}

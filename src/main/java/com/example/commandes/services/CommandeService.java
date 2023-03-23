package com.example.commandes.services;

import java.util.List;
import com.example.commandes.entities.Commande;

public interface CommandeService {

    Commande saveCommande(Commande c);
    Commande updateCommande(Commande c);
    void deleteCommande(Commande c);
    void deleteCommandeById(Long id);
    Commande getCommande(Long id);
    List<Commande> getAllCommandes();
}






package com.example.commandes.repository;

import com.example.commandes.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
package com.example.commandes.repository;

import com.example.commandes.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource(path = "rest")
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    void deleteCommandeById(Long id);

    Optional<Commande> findCommandeById(Long id);

}
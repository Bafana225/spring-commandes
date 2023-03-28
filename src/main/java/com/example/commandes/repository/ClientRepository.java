package com.example.commandes.repository;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource(path = "rest")
public interface ClientRepository extends JpaRepository<Client, Long> {
    void deleteClientById(Long id);

    Optional<Commande> findClientById(Long id);

}

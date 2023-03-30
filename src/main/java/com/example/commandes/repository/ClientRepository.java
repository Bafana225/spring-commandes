package com.example.commandes.repository;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource(path = "rest")
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientById(Long id);

    void deleteClientById(Long id);

    List<Client> findByTypeClientId(Long typeClientId);

}

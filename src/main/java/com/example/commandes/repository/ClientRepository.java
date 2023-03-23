package com.example.commandes.repository;

import com.example.commandes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByNomClient(String nom);
    List<Client> findByNomClientContains(String nom);

}

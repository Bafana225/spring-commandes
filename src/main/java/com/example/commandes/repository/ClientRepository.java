package com.example.commandes.repository;

import com.example.commandes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "rest")
public interface ClientRepository extends JpaRepository<Client, Long> {

}

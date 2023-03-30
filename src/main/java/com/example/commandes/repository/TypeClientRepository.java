package com.example.commandes.repository;

import com.example.commandes.entities.TypeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeClientRepository extends JpaRepository<TypeClient, Long>{

    TypeClient findTypeClientById(Long id);

    void deleteTypeClientById(Long id);

}

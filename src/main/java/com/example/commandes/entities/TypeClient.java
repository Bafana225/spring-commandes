package com.example.commandes.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class TypeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idTyp;
    @Column
    private String nomTyp;
    @Column
    private String descriptionTyp;


    @JsonIgnore
    @OneToMany(mappedBy = "type")
    private List<Client> clients;


}

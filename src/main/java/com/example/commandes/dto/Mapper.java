package com.example.commandes.dto;

import com.example.commandes.entities.Client;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public ClientGetDto personneGetDto(Client client){
        if(client == null){
            return null;
        }

        ClientGetDto personneGetDto = new ClientGetDto();
        personneGetDto.setId(client.getId());
        personneGetDto.setNombreCommandes(client.getCommandes().size());

        return personneGetDto;
    }

}


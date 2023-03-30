package com.example.commandes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientGetDto {
    @JsonProperty("Id du client")
    private Long id;

    @JsonProperty("Nombre de commandes passées")
    private Integer nombreCommandes;
}

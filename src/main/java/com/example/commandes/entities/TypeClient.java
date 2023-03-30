package com.example.commandes.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "type_client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class TypeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_client")
    private Long id;

    @Column
    private String nomTyp;

    @Column
    private String descriptionTyp;

}

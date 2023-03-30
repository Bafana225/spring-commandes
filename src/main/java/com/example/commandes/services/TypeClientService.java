package com.example.commandes.services;
import com.example.commandes.entities.TypeClient;
import com.example.commandes.repository.TypeClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeClientService {
    private final TypeClientRepository typeClientRepository;

    public TypeClientService(TypeClientRepository typeClientRepository) {
        this.typeClientRepository = typeClientRepository;
    }

    public TypeClient addType(TypeClient typePersonne) {
        return typeClientRepository.save(typePersonne);
    }

    public List<TypeClient> addTypes() {

        List<TypeClient> newType = new ArrayList<>();

        TypeClient Type1 = new TypeClient();
        Type1.setId(1L);
        Type1.setNomTyp("PARTICULIER");
        Type1.setDescriptionTyp("Catégorie des particuliers");

        addType(Type1);
        newType.add(Type1);

        TypeClient Type2 = new TypeClient();
        Type1.setId(2L);
        Type1.setNomTyp("PROFESSIONNELS");
        Type1.setDescriptionTyp("Catégorie des pros");

        addType(Type2);
        newType.add(Type2);

        return newType;

    }
}

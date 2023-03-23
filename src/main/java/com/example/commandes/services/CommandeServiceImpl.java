package com.example.commandes.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.commandes.entities.Commande;
import com.example.commandes.repository.CommandeRepository;
import org.springframework.stereotype.Service;

@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    CommandeRepository commandeRepository;
    @Override
    public Commande saveCommande(Commande p) {
        return commandeRepository.save(p);
    }
    @Override
    public Commande updateCommande(Commande p) {
        return commandeRepository.save(p);
    }
    @Override
    public void deleteCommande(Commande p) {
        commandeRepository.delete(p);
    }
    @Override
    public void deleteCommandeById(Long id) {
        commandeRepository.deleteById(id);
    }
    @Override
    public Commande getCommande(Long id) {
        return commandeRepository.findById(id).get();
    }
    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }
}

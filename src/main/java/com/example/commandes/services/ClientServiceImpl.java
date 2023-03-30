package com.example.commandes.services;
import java.util.ArrayList;
import java.util.List;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import com.example.commandes.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.commandes.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CommandeRepository commandeRepository;

    public Client findClientById(Long id) {
        return clientRepository.findClientById(id);
    }

    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Client c) {
        clientRepository.delete(c);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client addCommande(Long idClient ,Long idCommande) {
        Commande commande = commandeRepository.findCommandeById(idCommande);
        Client client = findClientById(idClient);
        if (client.getCommandes() != null) {
            client.getCommandes().add(commande);
            commande.setClient(client);
            commandeRepository.save(commande);
        }
        else{
            List<Commande> commandes = new ArrayList<>();
            commandes.add(commande);
            client.setCommandes(commandes);
        }
        return clientRepository.save(client);
    }

    public Client deleteCommande(Long idClient ,Long idCommande) {
        Commande commande = commandeRepository.findCommandeById(idCommande);
        Client client = findClientById(idClient);
        if (client.getCommandes() != null) {
            client.getCommandes().remove(commande);
            commande.setClient(client);
            commandeRepository.save(commande);
        }
        else{
            System.out.println("pas de commandes en base de données");
        }
        return clientRepository.save(client);
    }

}

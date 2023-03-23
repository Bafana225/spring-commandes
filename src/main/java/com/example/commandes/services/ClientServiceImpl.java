package com.example.commandes.services;
import java.util.List;

import com.example.commandes.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.commandes.entities.Commande;
import com.example.commandes.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;
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
}

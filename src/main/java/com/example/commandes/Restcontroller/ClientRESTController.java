package com.example.commandes.Restcontroller;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import com.example.commandes.services.ClientService;
import com.example.commandes.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients-api")
@CrossOrigin
public class ClientRESTController {

    @Autowired
    CommandeService commandeService;

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Client> getAllClients()
    {
        return clientService.getAllClients();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable("id") Long id) {
        return clientService.getClient(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @RequestMapping(value="/{id}/commandes", method = RequestMethod.GET)
    public List<Commande> getCommandesByClientId(@PathVariable("id") Long id) {
        Client client = clientService.getClient(id);
        return client.getCommandes();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable("id") Long id)
    {
        clientService.deleteClientById(id);
    }

}

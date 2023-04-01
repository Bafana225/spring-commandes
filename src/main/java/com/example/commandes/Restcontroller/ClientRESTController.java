package com.example.commandes.Restcontroller;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import com.example.commandes.services.ClientService;
import com.example.commandes.services.ClientServiceImpl;
import com.example.commandes.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients-api")
@CrossOrigin
public class ClientRESTController {

    @Autowired
    CommandeService commandeService;

    @Autowired
    private ClientServiceImpl clientServiceImpl;


    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List<Client> getAllClients()
    {
        return clientServiceImpl.getAllClients();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable("id") Long id) {
        return clientServiceImpl.getClient(id);
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Client createClient(@RequestBody Client client) {
        return clientServiceImpl.saveClient(client);
    }

    @RequestMapping(value="/update",method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client client) {
        return clientServiceImpl.updateClient(client);
    }

    @RequestMapping(value="/commandes/{id}", method = RequestMethod.GET)
    public List<Commande> getCommandesByClientId(@PathVariable("id") Long id) {
        Client client = clientServiceImpl.getClient(id);
        return client.getCommandes();
    }

    @RequestMapping(value="/add-command/{client_id}/{commande_id}", method=RequestMethod.PUT)
    public ResponseEntity<List<Commande>> addCommandeClient(@PathVariable Long client_id, @PathVariable Long commande_id) {
        Client client = clientServiceImpl.addCommande(client_id, commande_id);
        List<Commande> commandes = client.getCommandes();
        return ResponseEntity.ok(commandes);
    }


    @RequestMapping(value="/remove-command/{client_id}/{commande_id}",method = RequestMethod.DELETE)
    public ResponseEntity<Client> removeCommandeClient(@PathVariable Long client_id, @PathVariable Long commande_id){
        Client newClient = clientServiceImpl.deleteCommande(client_id, commande_id);
        return new ResponseEntity<>(newClient, HttpStatus.OK);
    }

    @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable("id") Long id)
    {
        clientServiceImpl.deleteClientById(id);
    }

}

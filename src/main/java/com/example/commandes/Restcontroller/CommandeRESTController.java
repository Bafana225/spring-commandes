package com.example.commandes.Restcontroller;

import com.example.commandes.entities.Client;
import com.example.commandes.entities.Commande;
import com.example.commandes.services.ClientService;
import com.example.commandes.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes-api")
@CrossOrigin
public class CommandeRESTController {

    @Autowired
    CommandeService commandeService;

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Commande> getAllCommandes()
    {
        return commandeService.getAllCommandes();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Commande getCommandeById(@PathVariable("id") Long id) {
        return commandeService.getCommande(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeService.saveCommande(commande);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Commande updateCommande(@RequestBody Commande commande) {
        return commandeService.updateCommande(commande);
    }

    @RequestMapping(value="/{id}/client", method = RequestMethod.GET)
    public Long getClientIdByCommandeId(@PathVariable("id") Long id) {
        Commande commande = commandeService.getCommande(id);
        Client client = commande.getClient();
        return client.getId();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteCommande(@PathVariable("id") Long id)
    {
        commandeService.deleteCommandeById(id);
    }

}

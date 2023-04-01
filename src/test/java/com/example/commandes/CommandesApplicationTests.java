package com.example.commandes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.commandes.Restcontroller.ClientRESTController;
import com.example.commandes.entities.Client;
import com.example.commandes.repository.ClientRepository;
import com.example.commandes.repository.CommandeRepository;
import com.example.commandes.services.ClientServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import com.example.commandes.entities.Commande;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CommandesApplicationTests {
	@Test
	void contextLoads() {
	}
	@Mock
	private ClientRepository personneRepository;

	@Mock
	private CommandeRepository  commandeRepository;

	@InjectMocks
	private ClientRESTController clientService;


	@Test
	public void testAddCommandeClient() {

		Commande commande = new Commande();
		commande.setId(1L);
		commande.setDateCommande(LocalDate.parse("2023-08-08"));
		commande.setMontantTotal(200.0);

		Client client = new Client();
		client.setId(1L);
		client.setNom("Jean");
		client.setPrenom("Dupont");
		client.setEmail("dupon@gmail.com");
		client.setTelephone("0785596998");
		client.setCommandes(new ArrayList<>());

		clientService.addCommandeClient(1L, 1L);

		assertNotNull(client.getCommandes());

		List<Commande> commandes = client.getCommandes();
		assertNotNull(commandes);

		assertEquals(1, commandes.size());
	}
}
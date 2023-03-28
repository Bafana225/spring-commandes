package com.example.commandes;

import java.time.LocalDate;
import java.util.List;


import com.example.commandes.entities.Client;
import com.example.commandes.repository.ClientRepository;
import com.example.commandes.repository.CommandeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.commandes.entities.Commande;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class CommandesApplicationTests {
	@Autowired
	private CommandeRepository commandeRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Test
	public void testCreateCommande() {
		Commande cmd = new Commande(1, LocalDate.now(), 2200.500);
		commandeRepository.save(cmd);
		assertNotNull(cmd.getId());
	}

	@Test
	public void testCreateClient() {
		Client client = new Client();
		client.setNom("Doe");
		client.setPrenom("John");
		client.setEmail("john.doe@example.com");
		client.setTelephone("555-1234");
		clientRepository.save(client);
		assertNotNull(client.getId());
	}

//	@Test
//	public void testFindByNomClient()
//	{
//		List<Client> clients = clientRepository.findByNomClient("Doe");
//		for (Client c : clients)
//		{
//			System.out.println(c);
//		}
//	}
//	@Test
//	public void testFindByNomClientContains ()
//	{
//		List<Client> clients=clientRepository.findByNomClientContains("En");
//		for (Client c : clients)
//		{
//			System.out.println(c);
//		} }
}

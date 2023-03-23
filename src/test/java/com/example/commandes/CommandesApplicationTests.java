package com.example.commandes;

import java.time.LocalDate;


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

	@Test
	public void testCreateCommande() {
		Commande cmd = new Commande(LocalDate.now(), 2200.500);
		commandeRepository.save(cmd);
		assertNotNull(cmd.getId());
	}
}

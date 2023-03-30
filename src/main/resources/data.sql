USE spring_db;

CREATE TABLE IF NOT EXISTS Commandes (
  id_commande INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50)
);
INSERT INTO commande (id, date_commande, montant_total) VALUES (1, '2022-01-01', 150.0);
INSERT INTO commande (id, date_commande) VALUES (2, '2022-02-15');
INSERT INTO commande (date_commande, montant_total) VALUES ('2022-03-30', 200.0);

CREATE TABLE IF NOT EXISTS client (
  id_type_client INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50)
);
INSERT INTO client (nom, prenom, email, telephone) VALUES ('Doe', 'John', 'johndoe@example.com', '555-1234');
INSERT INTO client (id, nom, prenom, email, telephone) VALUES (1, 'Doe', 'John', 'johndoe@example.com', '555-1234');
INSERT INTO client (id, nom, prenom, email, telephone) VALUES (2, 'Smith', 'Jane', 'janesmith@example.com', '555-5678');

CREATE TABLE IF NOT EXISTS type_client (
  id_type_client INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50)
);
INSERT IGNORE INTO client (nom) VALUES (1, 'PARTICULIER', 'Catégorie des particuliers');
INSERT IGNORE INTO client (nom) VALUES (2, 'PROFESSIONNEL', 'Catégorie des pros');






--ALTER TABLE type_client MODIFY COLUMN id_type_client INT AUTO_INCREMENT;
--ALTER TABLE type_personne MODIFY COLUMN id_typepersonne INT AUTO_INCREMENT;

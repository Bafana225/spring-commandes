USE spring_db;

CREATE TABLE IF NOT EXISTS Commandes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50),
  date_commande DATE,
  montant_total DECIMAL(10,2)
);

INSERT INTO Commandes (id, date_commande, montant_total) VALUES (1, '2022-01-01', 150.0);
INSERT INTO Commandes (id, date_commande, montant_total) VALUES (2, '2022-02-15', 456.0);
INSERT INTO Commandes (id, date_commande, montant_total) VALUES (3, '2022-03-30', 200.0);

CREATE TABLE IF NOT EXISTS clients (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50),
  prenom VARCHAR(50),
  email VARCHAR(100),
  telephone VARCHAR(20)
);

INSERT INTO clients (id, nom, prenom, email, telephone) VALUES (1, 'Doe', 'John', 'johndoe@example.com', '0754566583');
INSERT INTO clients (id, nom, prenom, email, telephone) VALUES (2, 'Poe', 'Mohn', 'poemohn@example.com', '0785653658');
INSERT INTO clients (id, nom, prenom, email, telephone) VALUES (3, 'Smith', 'Jane', 'janesmith@example.com', '0756256589');

CREATE TABLE IF NOT EXISTS type_client (
  id_type_client INT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(50),
  description VARCHAR(100)
);

INSERT IGNORE INTO type_client (id_type_client, nom, description) VALUES (1, 'PARTICULIER', 'Catégorie des particuliers');
INSERT IGNORE INTO type_client (id_type_client, nom, description) VALUES (2, 'PROFESSIONNEL', 'Catégorie des pros');

--ALTER TABLE type_client MODIFY COLUMN id_type_client INT AUTO_INCREMENT;


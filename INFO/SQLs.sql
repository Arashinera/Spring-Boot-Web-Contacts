CREATE DATABASE contact_db;

CREATE TABLE IF NOT EXISTS contacts
( id BIGINT NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	contacts (image, first_name, last_name, phone_number)
VALUES
	('maria.jpg', 'Maria', 'Glazova', '045-583-1700'),
	('letty.jpg', 'Letty', 'Ripnick', '057-121-8990'),
	('pablo.jpg', 'Pablo', 'Martinez', '098-745-0081');


Drop database if exists banco_filme; 

CREATE DATABASE if not EXISTS banco_filme;

use banco_filme;

create table filme(
	`idFilme` INT NOT NULL AUTO_INCREMENT,
	`titulo` VARCHAR(45) NOT NULL,
	`diretor` VARCHAR(45) NOT NULL,
	`genero` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`idFilme`)
);

SELECT * FROM filme order by idFilme;


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

insert into filme (titulo, diretor, genero) values ('O filme', 'Diretor Foda', 'genero');

SELECT * FROM filme order by idFilme;
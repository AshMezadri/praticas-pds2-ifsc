Drop database if exists banco_filme; 

create database banco_filme;

use banco_filme;

create table filme(
	`idFilme` INT NOT NULL AUTO_INCREMENT,
	`titulo` VARCHAR(45) NOT NULL,
	`diretor` VARCHAR(45) NOT NULL,
	`genero` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`idFilme`)
);
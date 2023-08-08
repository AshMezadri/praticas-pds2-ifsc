Drop database if exists banco_filme; 

create database banco_filme;

use banco_filme;

create table filme(
	`id_filme` INT NOT NULL AUTO_INCREMENT,
	`nome_filme` VARCHAR(45) NOT NULL,
	`diretor` VARCHAR(45) NOT NULL,
	`genero` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`id_filme`)
);
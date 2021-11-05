use agenda;

drop table cidade;

create table cidade(
	id int not null auto_increment,
	nome varchar(15),
	id_cidade int not null,
	primary key(id));
	

alter table cidade add constraint fk_cidade_pessoa
foreign key (id_pessoa) 
			references pessoa(id);
select * from cidade;


create table estado(
	id int not null auto_increment,
	nome varchar(15),
	id_cidade int not null,
	primary key(id));

alter table estado add constraint fk_estado_cidade
foreign key (id_cidade) 
			references cidade(id);
	
drop table estado;


create table formacao(
	id int not null auto_increment,
	grau varchar(10),
	id_pessoa int not null,
	primary key(id));
	

alter table formacao add constraint fk_formacao_pessoa
foreign key (id_pessoa) 
			references pessoa(id); 
			
		
		
create table pessoa(
	id int not null auto_increment,
	nome varchar(100),
	primary key(id));

select * from pessoa;

create table contato(
	id int not null auto_increment,
	telefone varchar(13),
	data date,
	email varchar(30),
	id_pessoa int not null,
	primary key(id));
	
select * from contato;


alter table contato add constraint fk_contato_pessoa
foreign key (id_pessoa) 
			references pessoa(id);
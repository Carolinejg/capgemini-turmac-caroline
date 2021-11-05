-- CRIADNO A BASE DE DADOS
create schema mydb;

-- USANDO A BASE DE DADOS CRIADA
use mydb;


-- CRIANDO TABELA
create table ALUNO(
	id int not null auto_increment,
	nome varchar(20),
	data_nasc date,
	sobrenome varchar(60),
	endereco varchar(150),
	primary key(id));


desc ALUNO;

-- DELETANDO ALUNO
drop table ALUNO;

-- CRIANDO TABELA
create table ALUNO(
	id int not null auto_increment,
	nome varchar(20) not null,
	sobrenome varchar(60) not null,
	nome_pai varchar(50),
	nome_mae varchar(50),
	endereco varchar(150),
	numero_casa int,
	cidade varchar(60),
	estado char(2),
	primary key(id));

-- criando tabela 
create table INSTITUICAO_ENSINO(
	id int not null auto_increment,
	nome varchar(50) not null,
	endereco varchar(150) not null,
	telefone int not null,
	observacao varchar(150) not null,
	primary key(id));

desc INSTITUICAO_ENSINO;

-- deletando coluna
alter table INSTITUICAO_ENSINO drop column observacao;

-- adicionando campos
alter table INSTITUICAO_ENSINO add column nome_reitor varchar(60);
alter table INSTITUICAO_ENSINO add column nome_vice_reitor varchar(60);
alter table INSTITUICAO_ENSINO add column data_inauguracao timestamp;

-- excluir colunas
alter table INSTITUICAO_ENSINO drop column nome_reitor;
alter table INSTITUICAO_ENSINO drop column nome_vice_reitor;

-- criando tabela 
create table PROFESSOR(
	id int not null auto_increment,
	nome varchar(30) not null,
	titularidade varchar(50) not null,
	endereco varchar(150) not null,
	primary key (id));

desc PROFESSOR;
desc INSTITUICAO_ENSINO;

-- excluindo coluna
alter table PROFESSOR drop column endereco;

-- adicionando coluna em professor
alter table PROFESSOR add column cidade_residencia varchar(50) not null;
alter table PROFESSOR add column cidade_nasc varchar(50) not null;
alter table PROFESSOR add column salario float not null;

-- alterando coluna 
alter table PROFESSOR MODIFY salario float(8,2);

-- alterando nome da tabela 
rename table INSTITUICAO_ENSINO to FACULDADE;
desc FACULDADE;

-- criando tabela 
create table DEPARTAMENTO(
	id int not null auto_increment,
	nome varchar(50) not null,
	nome_presidente varchar(50) not null,
	localizacao varchar(150) not null,
	orcamento_mensal float,
	primary key(id));

desc DEPARTAMENTO;

-- RENOMEAR TABELA
rename table DEPARTAMENTO to CENTRO;
desc CENTRO;


use loja;

drop table fornecedor;
drop table produto ;
select * from fornecedor ;

create table fornecedor(
	id int not null auto_increment,
	nome varchar(100),
	primary key(id));
	
create table produto(
	id int not null auto_increment,
	descricao varchar(100),
	id_fornecedor int,
	primary key(id));
	
insert into produto(descricao)values('scarpin');
insert into produto(descricao)values('sapato');
insert into produto(descricao)values('tenis');
insert into produto(descricao)values('bota');
insert into produto(descricao)values('sapato social');
insert into produto(descricao)values('sapato social com bico fino');
select * from produto;

delete  from produto;

insert into fornecedor(nome)values('arezzo');
insert into fornecedor(nome)values('mizuno');
insert into fornecedor(nome)values('capordarte s/a');
select * from fornecedor f ;

	
select * from fornecedor f ;
select * from produto p ;

-- preenchendo os dados de produto com as informações do fornecedor
update produto set id_fornecedor = 1 where id=12;
update produto set id_fornecedor = 2 where id=13;	
update produto set id_fornecedor = 3 where id in(14,11,15);	
update produto set id_fornecedor = 1 where id=16;

-- altera o atributo para colocar como OBRIGATORIO
alter table produto modify id_fornecedor int not null;

insert into produto(descricao,id_fornecedor)values('outro produto', 2);

-- adicionando colunas 
alter table fornecedor add column codigo_fornecedor varchar(10);
alter table fornecedor add column razao_social varchar(100);
alter table fornecedor add column telefone varchar(20);

alter table produto add column codigo_produto varchar(20);
alter table produto add column valor float(10,2);
alter table produto add column situacao varchar(1);

select * from fornecedor f ;
select * from produto p ;
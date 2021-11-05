use agenda;

insert into pessoa(nome)values('Alice');
insert into contato(telefone,data_cadastro ,email,id_pessoa)values('81996550855',now(),'alicefms@hotmail.com',1);
insert into cidade(nome,id_pessoa)values('salvador',1);
insert into estado(nome,id_cidade)values('bahia',1);
insert into formacao (grau,id_pessoa)values('1',1);

insert into pessoa(nome)values('Alinne');
insert into contato(telefone,data_cadastro ,email,id_pessoa)values('81954545455',now(),'alinnefms@hotmail.com',2);
insert into cidade(nome,id_pessoa)values('belo horizonte',2);
insert into estado(nome,id_cidade)values('minas gerais',2);
insert into formacao (grau,id_pessoa)values('1,2',2);




insert into pessoa(nome)values('Amanda');
insert into contato(telefone,data_cadastro ,email,id_pessoa)values('81996444445',now(),'amandafms@hotmail.com',3);
insert into cidade(nome,id_pessoa)values('blumenau',3);
insert into estado(nome,id_cidade)values('santa catarina',3);
insert into formacao (grau,id_pessoa)values('1,2,3',3);
insert into contato(telefone,data_cadastro ,email,id_pessoa)values('81000000000',now(),'amandafms@hotmail.com',3);



select * from contato;
select * from pessoa;
select * from cidade;
select * from estado e ;
describe formacao ;



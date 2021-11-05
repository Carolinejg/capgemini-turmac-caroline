use loja;

-- inserindo dados

insert into cliente(nome) values('Alicio');
insert into cliente(nome,data_cadastro)values('Palloma',now());


select * from cliente;

-- fazer update e delete sempre pelo id 
update cliente set cadigo_cliente = "1234" where id=3;

-- deletando dados da tabela
delete  from cliente;




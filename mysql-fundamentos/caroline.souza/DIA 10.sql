use loja;

select * from cliente;
desc cliente;
## Inicio popula tabela clientes falta cidade e estado tamhno varchar 2
insert into cliente values( 1,'0001','AARONSON FURNITURE'      ,'AARONSON FURNITURE LTD' ,'2015-02-17 23:14:50',     '17.807.928/0001-85', '(21) 8167-6584' ,'QUEIMADOS'             ,'RJ' );
insert into cliente values( 2,'0002','LITTLER '                ,'LITTLER  LTDA'         ,'2015-02-17 23:14:50',     '55.643.605/0001-92', '(27) 7990-9502' ,'SERRA'                 ,'ES' );
insert into cliente values( 3,'0003','KELSEY  NEIGHBOURHOOD'    ,'KELSEY  NEIGHBOURHOOD' ,'2015-02-17 23:14:50',     '05.202.361/0001-34', '(11) 4206-9703' ,'BRAGANÇA PAULISTA'     ,'SP' );
insert into cliente values( 4,'0004','GREAT AMERICAN MUSIC'    ,'GREAT AMERICAN MUSIC'    ,'2015-02-17 23:14:50',     '11.880.735/0001-73', '(75) 7815-7801' ,'SANTO ANTÔNIO DE JESUS','BA' );
insert into cliente values( 5,'0005','LIFE PLAN COUNSELLING'    ,'LIFE PLAN COUNSELLING' ,'2015-02-17 23:14:50',     '75.185.467/0001-52', '(17) 4038-9355' ,'BEBEDOURO'             ,'SP' );
insert into cliente values( 6,'0006','PRACTI-PLAN'              ,'PRACTI-PLAN LTDA'     ,'2015-02-17 23:14:50',     '32.518.106/0001-78', '(28) 2267-6159' ,'CACHOEIRO DE ITAPEMIRI','ES' );
insert into cliente values( 7,'0007','SPORTSWEST'              ,'SPORTSWEST LTDA'       ,'2015-02-17 23:14:50',     '83.175.645/0001-92', '(61) 4094-7184' ,'TAGUATINGA'           ,'DF' );
insert into cliente values( 8,'0008','HUGHES MARKETS'          ,'HUGHES MARKETS LTDA'   ,'2015-02-17 23:14:50',     '04.728.160/0001-02', '(21) 7984-9809' ,'RIO DE JANEIRO'       ,'RJ' );
insert into cliente values( 9,'0009','AUTO WORKS'              ,'AUTO WORKS LTDA'       ,'2015-02-17 23:14:50',     '08.271.985/0001-00', '(21) 8548-5555' ,'RIO DE JANEIRO'       ,'RJ' );
insert into cliente values( 10,'00010','DAHLKEMPER '           ,'DAHLKEMPER  LTDA'     ,'2015-02-17 23:14:50',   '49.815.047/0001-00','(11) 4519-7670'  ,'SÃO PAULO'             ,'SP' );
## Fim popula tabela clientes

alter table cliente add column cidade varchar(30);
alter table cliente add column estado varchar(2);

alter table cliente  modify estado char(2);
desc vendedor ;
select * from vendedor;
## Inicio popula tabela Vendedores Ok
insert into vendedor values(null,'0001','CARLOS FERNANDES','CARLOS FERNANDES LTDA',  '(47) 7535-8144',12);
insert into vendedor values(2,'0002','JÚLIA GOMES','JÚLIA GOMES LTDA',       '(12) 8037-6661',25);
## Fim popula tabela Vendedores

select * from fornecedor f ;
desc fornecedor; -- verificar antes de aplicar o insert 
## Inicio popula tabela Fornecedores
insert into fornecedor values(4 ,'DUN RITE LAWN MAINTENANCE','0001','DUN RITE LAWN MAINTENANCE LTDA' ,'(85) 7886-8837' );
insert into fornecedor values(null,'SEWFRO FABRICS','0002' ,'SEWFRO FABRICS LTDA','(91) 5171-8483' );
## Fim popula tabela Fornecedores

-- EXCLUINDO REGISTROS DE TESTE 
delete from fornecedor where id in() coloca o id 



desc produto;
select * from produto;
## Inicio popula tabela Produtos
insert into produto values(null,'NOTEBOOK',1,'123131','1251.29','A'); -- 4
insert into produto values(null,'SMARTPHONE',2,'123223','1242.21','A'); -- 5
insert into produto values(null,'DESKTOP',1,'1231','1241.21','A');
insert into produto values(null,'TELEVISÃO',2,'142123','2564.92','A');
insert into produto values(null,'DRONE',1, '7684','2325.32','A');
## Fim popula tabela Produtos

update produto SET id_fornecedor = 4 WHERE id = 22;
update produto SET id_fornecedor = 5 WHERE id = 21;

desc venda;
select * from venda;

update venda SET id_fornecedor = 4 WHERE id = 19;
update venda SET id_fornecedor = 5 WHERE id = 20;
## Inicio popula tabela Vendas  
insert into venda values(null,'1', 1 , 4 , 1 ,  '25141.02'  , 0 , '25141.02'  ,  '2015-01-01' );
insert into venda values(null, '2', 2 , 2 , 2 ,'12476.58',0,'12476.58','2015-01-02');
insert into venda values(null,'3', 3 , 4 , 1 ,  '16257.32'  , 0 , '16257.32'  ,  '2015-01-03' );
insert into venda values(null, '4' , 4 , 2 , 2 ,  '8704.55',    0 , '8704.55'   ,  '2015-01-04' );
insert into venda values(null, '5' , 5 , 1 , 1 ,  '13078.81', 0 , '13078.81'  ,  '2015-01-01' );
insert into venda values(null, '6', 6 , 2 , 2 ,  '6079.19',    0 , '6079.19'   ,  '2015-01-02' );
insert into venda values(null, '7' , 7 , 1 , 1 ,  '7451.26',    0 , '7451.26'   ,  '2015-01-03' );
insert into venda values(null, '8', 8 , 2 , 2 ,  '15380.47', 0 , '15380.47'  ,  '2015-01-04' );
insert into venda values(null, '9' , 9 , 1 , 1 ,  '13508.34', 0 , '13508.34'  ,  '2015-01-01' );
insert into venda values(null, '10' , 1 , 2 , 2 ,  '20315.07', 0 , '20315.07'  ,  '2015-01-02' );
insert into venda values(null, '11' , 1 , 1 , 1 ,  '8704.55',    0 , '8704.55'   ,  '2015-01-01' );
insert into venda values(null, '12' , 2 , 2 , 2 ,  '11198.05', 0 , '11198.05'  ,  '2015-01-02' );
insert into venda values(null, '13' , 3 , 1 , 1 ,  '4967.84',    0 , '4967.84'   ,  '2015-01-03' );
insert into venda values(null, '14' , 3 , 2 , 2 ,  '7451.26',    0 , '7451.26'   ,  '2015-01-04' );
insert into venda values(null, '15' , 5 , 1 , 1 ,  '10747.359', 0 , '10747.36'  ,  '2015-01-01' );
insert into venda values(null, '16' , 6 , 2 , 2 ,  '13502.34', 0 , '13502.34'  ,  '2015-01-02' );
insert into venda values(null, '17' , 7 , 1 , 1 ,  '22222.99', 0 , '22222.99'  ,  '2015-01-03' );
insert into venda values(null, '18' , 8 , 2 , 2 ,  '15465.69', 0 , '15465.69'  ,  '2015-01-04' );
insert into venda values(null, '19' , 9 , 1 , 1 ,  '4650.64',    0 , '4650.64'   ,  '2015-01-01' );
insert into venda values(null, '20' , 9 , 2 , 2 ,  '6975.96',    0 , '6975.96'   ,  '2015-01-02' );
## Fim popula tabela Vendas

desc item_venda; 
select * from item_venda iv ;
## Inicio popula tabela Itens Vendas
insert into item_venda values(1 ,1 ,11,'1251.29',1,0);
insert into item_venda values(2 ,1 ,12,'1242.21',2,0);
insert into item_venda values(null ,1 ,13,'1241.21',3,0);
insert into item_venda values(null,1 ,14,'1513.77',4,0);
insert into item_venda values(null,1 ,15,'2325.32',5,0);              
insert into item_venda values(null,2 ,11,'1251.29',6,0);              
insert into item_venda values(null,3 ,13,'1241.21',7,0);              
insert into item_venda values(null,4 ,11,'1251.29',1,0);              
insert into item_venda values(null,5 ,13,'1241.21',2,0);              
insert into item_venda values(null,6 ,11,'1251.29',3,0);              
insert into item_venda values(null,7 ,12,'1242.21',4,0);              
insert into item_venda values(null,8 ,15,'2325.32',5,0);
insert into item_venda values(null,9 ,12,'1242.21',6,0);
insert into item_venda values(null,10,13,'1241.21',7,0);
insert into item_venda values(null,11,11,'1251.29',1,0);
insert into item_venda values(null,12,11,'1251.29',2,0);
insert into item_venda values(null,13,12,'1242.21',3,0);
insert into item_venda values(null,14,12,'1242.21',4,0);
insert into item_venda values(null,15,13,'1241.21',5,0);
insert into item_venda values(null,16,13,'1241.21',6,0);
insert into item_venda values(null ,17,14,'1513.77',7,0);
insert into item_venda values(null ,18,14,'1513.77',1,0);
insert into item_venda values(null ,19,15,'2325.32',2,0);
insert into item_venda values(null ,20,15,'2325.32',3,0);
insert into item_venda values(null ,2 ,12,'1242.21',4,0);
insert into item_venda values(null ,3 ,14,'1513.77',5,0);
insert into item_venda values(null ,4 ,12,'1242.21',6,0);
insert into item_venda values(null ,5 ,14,'1513.77',7,0);
insert into item_venda values(null ,6 ,15,'2325.32',1,0);
insert into item_venda values(null,7 ,13,'1241.21',2,0);
insert into item_venda values(null,8 ,11,'1251.29',3,0);
insert into item_venda values(null,9 ,14,'1513.77',4,0);
insert into item_venda values(null,10,15,'2325.32',5,0);
insert into item_venda values(null,11,12,'1242.21',6,0);
insert into item_venda values(null,12,12,'1242.21',7,0);
insert into item_venda values(null,13,13,'1241.21',1,0);
insert into item_venda values(null,14,13,'1241.21',2,0);
insert into item_venda values(null,15,14,'1513.77',3,0);
insert into item_venda values(null,16,14,'1513.77',4,0);
insert into item_venda values(null,17,15,'2325.32',5,0);
insert into item_venda values(null,18,15,'2325.32',6,0);
## Fim popula tabela  Itens Vendas

-- PARA CRIAR VALORES DEFAULT 
create table t3 (SITUACAO boolean default true, nome varchar(5));
insert into t3(nome)values('bota');
select * from t3;
insert into t3(SITUACAO,nome)values(false,'bota');
desc t3;
drop table t3;

-- possui qualquer lugar da string
select * from produto where descricao like'%no%'
-- inicia com sa
select * from produto where descricao like'sa%'
-- termina com ne 
select * from produto where descricao like'%ne'

-- ordenando a seleção
select * from produto order by valor desc;

-- conta total de linhas 
select count(*)from item_venda iv ;

-- funcao de formatacao para ter a saída 
select id as 'Codigo do produto',
	descricao as 'Descricao',
	codigo_produto as 'Codigo interno',
	concat('RS', format(valor,2))'Valor'
	from produto order by id desc;

-- pega o valor max
select max(valor) from produto;

-- pega o valor minimo
select min(valor) from produto;

-- pega o somatorio
select sum(valor) from produto;

-- somar duas colunas com o operador +
select max(valor)+ min(valor) from produto;

-- inner join - juncao obrigatória 
select * from produto p 
 inner join fornecedor f 
 on p.id_fornecedor  = f.id ;

##inner join - juncao obrigatoria
select p.descricao as 'produto', f.nome as 'fornecedor'
from produto p
inner join fornecedor f on f.id = p.id_fornecedor;

select codigo_produto as 'Cod.Interno', 
descricao as 'Produto', 
valor as 'Preco unitario',
f.razao_social as 'Fornecedor',
f.telefone as 'Contato fornecedor'
from produto p
inner join fornecedor f on p.id_fornecedor = f.id;

## por mais que funcione evitar esse tipo de query de ligacao de tabelas com where
## where deve ser usado apenas para condicao juncao de tabela faz com join
select codigo_produto as 'Cod. interno',
descricao as 'Produto', 
valor as 'Preco unitario'
from produto p, fornecedor f 
where p.id_fornecedor = f.id 
and p.id_fornecedor is not null;

#continuacao com join 
select codigo_produto as 'Cod.Interno', 
descricao as 'Produto', 
valor as 'Preco unitario',
f.razao_social as 'Fornecedor',
f.telefone as 'Contato fornecedor'
from produto p
inner join fornecedor f on p.id_fornecedor = f.id
where valor > 2000;

-- usando o NOT IN apresenta somente os ids que não sâo esses 
select * from cliente where id not in(2,6);

-- subconsultas apresenta somente os cliente que possui vendas
select c.nome, c.data_cadastro from cliente c
where id in(select id_cliente from venda v where id);

-- eu que fiz e ta errado
select  c.nome, c.data_cadastro from cliente c left join venda v
on c.id = v.id_cliente ;

select * from cliente;

-- apresenta somente os cliente que não possui vendas
select c.nome, c.data_cadastro from cliente c
where id not in(select id_cliente from venda v where id);

-- Subconsulta dentro do select 
select (select c.nome from cliente c where c.id = v.id_cliente)as 'Nome cliente', v.*
from venda v;

select id_cliente from venda v;
select id,nome from cliente;

select c.id,c.nome,c.data_cadastro
from cliente c 
where id not in(select id_cliente from venda v where id);

select c.nome, v.*
from venda v 
inner join cliente c on c.id = v.id_cliente ;

-- quantidade de vendas por cliente 
select c.id, 
		c.nome, 
		count(codigo_venda) 'qtd compras'
		from venda v
		inner join cliente c on c.id = v.id_cliente 
		group by c.id, v.id_cliente 
		order by c.nome ;
	
-- Saber quantas vezes um cliente comprou em um determindado fornecedor
select c.id as 'codigo interno', 
        c.nome as 'Cliente',
        id_fornecedor,
        count(id_fornecedor) 'qtde de compra em de cada fornecedor'
from     venda v
inner join cliente c on c.id = v.id_cliente
where id_cliente  = 2
group by id_fornecedor, id_cliente
order by id_cliente;

-- outra solução
select     c.id as 'Codigo cliente',
        c.nome as 'Nome cliente',
        count(codigo_venda) as 'Qtd compras',
        f.id as 'Codigo Fornecedor',
        f.nome as 'Nome fornecedor'
from     venda v 
inner join fornecedor f on v.id_fornecedor = f.id
inner join cliente c on c.id = v.id_cliente 
group by c.id, v.id_fornecedor 
order by id_cliente, id_fornecedor ;


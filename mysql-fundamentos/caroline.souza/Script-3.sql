use loja;

-- criando as outras chaves estrangeiras 

-- adicionando a chave estrangeira 
alter table produto add constraint fk_produto_fornecedor foreign key (id_fornecedor) 
			references fornecedor(id);
		
alter table venda add constraint fk_venda_cliente 
foreign key (id_cliente) 
			references cliente(id);
		
alter table venda add constraint fk_venda_vendedor 
foreign key (id_vendedor) 
			references vendedor(id);
		
alter table venda add constraint fk_venda_fornecedor 
foreign key (id_fornecedor) 
			references fornecedor(id);
		


alter table item_venda add constraint fk_item_venda_produto 
foreign key (id_produto) 
			references produto(id);
	
-- remove uma fk de tabela 
		
alter table item_venda drop constraint fk_item_venda;


select * from vendedor v  ;
select * from venda v2   ;
select * from fornecedor f ;
select * from cliente c ;
select * from produto p ;
select * from item_venda iv ;
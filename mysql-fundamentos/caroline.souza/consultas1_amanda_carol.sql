create schema biblioteca;
use biblioteca;

-- criando tabela 
create table LIVRO(
	id int not null auto_increment,
	nome varchar(50),
	ano char(4),
	autor varchar(40),
	qtd_pagina int,
	primary key(id));

desc LIVRO;

-- inserindo dados
insert into LIVRO values(1,'Dom Quixote','1605','Miguel De Servantes',378); 
insert into LIVRO values(null,'Guerra e Paz','1869','Liev Tolst�i',652); 
insert into LIVRO values(null,'A Montanha M�gica','1924','Thomas Mann',847); 
insert into LIVRO values(null,'Ulisses','1922','James Joyce',65);
insert into LIVRO values (null, 'O Som e a Furia', '1929', 'William Faulkner', 254);
insert into LIVRO values (null, 'Em Busca do Tempo Perdido', '1913', 'Marcel Proust', 872);
insert into LIVRO values (null, 'A Divina Com�dia', '1321', 'Dante Alighieri', 587);
insert into LIVRO values (null, 'Cem Anos de Solid�o', '1967', 'Gabriel Garc�a M�rquez', 987);

-- consultas
-- �	Trazer apenas livros com data de lan�amento maior que 1900
select * from LIVRO where ano > '1900';

-- �	Trazer apenas livros com data de lan�amento menor que 1605.
select * from LIVRO where ano < '1605';

--  Trazer apenas livros com data de lan�amento maior igual 1967.
select * from LIVRO where ano >= '1967';

-- � Trazer apenas livros que s�o do autor Liev Tolst�i
select * from LIVRO where autor = 'Liev Tolst�i';

-- Trazer apenas livros que s�o do autor James Joyce ou Marcel Proust
select * from LIVRO where autor = 'James Joyce' or autor = 'Marcel Proust';

-- �	Trazer apenas livros que a quantidade de p�ginas for maior/igual que 600 e menor/igual que 1000 
-- (lembrando que pode ser utilizado o (> e <) ou (between)

select * from LIVRO where qtd_pagina between 600 and 1000;

-- �	Trazer apenas livros que a quantidade de p�ginas for maior que 367 ou que sejam do ano de 1605
select * from LIVRO where qtd_pagina > 367 or ano = '1605';

-- �	Trazer apenas livros que o nome � Ulisses e quantidade de p�ginas maior/igual a 65.
select * from LIVRO where qtd_pagina > 65 or nome = 'Ulisses';

-- �	Trazer todos os livros trazendo apenas o nome do livro e ano de lan�amento.
select nome 'NOME', ano'ANO' from LIVRO;

-- Trazer apenas os autores que escreveram livros com mais de 400 p�ginas.
select autor'AUTORES' from LIVRO where qtd_pagina > 400;

-- Trazer apenas os livros que tenham �Anos� no nome ou que sejam do autor de tenha o nome �Liev�
select nome'NOMES' from LIVRO where nome like '%Anos%' or autor like '%Liev%';

-- Trazer apenas os livros que tenham o nome do autor que possuam a letra �w� independente de mai�scula ou min�scula.
select nome'NOMES' from LIVRO where autor like '%g%';

-- Trazer apenas livros que comecem com a letra g independente de mai�scula ou min�scula
select nome'NOMES' from LIVRO where nome like 'g%';

-- Trazer todos os nomes dos livros com a seguinte estrutura: Nome: <NOME DO LIVRO>, autor <AUTOR> do ano <ANO DO LAN�AMENTO>
select nome'NOME DO LIVRO',autor'AUTOR',ano'ANO DE LAN�AMENTO' from LIVRO;

-- Trazer todos os livros selecionado apenas os nomes e quantos anos tem o livro se baseando neste ano e no ano de 2000
select nome 'NOMES DOS LIVROS', (2000 - ano)'ANOS DO LIVRO' from livro;

-- Trazer os nomes dos livros com a seguinte estrutura: Nome <NOME> - Ano de lan�amento <ANO DO LAN�AMENTO>, 
-- somente dos livros que possuem mais/igual de 60 anos e menos/igual de 300 anos.

select nome'NOME', ano'ANO DO LAN�AMENTO' from LIVRO where (2000 - ano)between 60 and 300;

-- 
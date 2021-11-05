use biblioteca;

-- inserindo dados 

insert into LIVRO values(null,'Chapeuzinho vermelho','1899','Miguel De Cervantes',12);
insert into LIVRO values(null,'Dona florinda','1968','Miguel De Cervantes',59);
select * from LIVRO;
desc LIVRO;

-- •	Exibir o nome dos livros, autor e ano de lançamento, 
-- ordenando pelo nome do autor e ano de lançamento sendo o ano de lançamento descrecente.

select nome'Nome Livro', autor'Autor',ano'Ano de Lançamento' from LIVRO order by ano  desc, autor;

-- criando coluna

alter table LIVRO add column volume int;

update LIVRO set volume = 1; 

alter table LIVRO add column data_edicao timestamp;

update LIVRO set data_edicao = '2016/06/23' where nome = 'Dom Quixote';
update LIVRO set data_edicao = '1989/02/28' where nome = 'Guerra e Paz';
update LIVRO set data_edicao = '2015/02/01 14:25:00' where nome = 'A Montanha Mágica';
update LIVRO set data_edicao = '1989/12/09' where nome = 'Ulisses';
update LIVRO set data_edicao = '1902/08/29' where nome = 'Cem Anos de Solidão';
update LIVRO set data_edicao = '1806/09/28' where nome = 'A Divina Comédia';

alter table LIVRO MODIFY data_edicao datetime;

update LIVRO set data_edicao = '2005/09/08' where data_edicao is null;

-- •	Selecionar o nome do livro e autor ordenando pela data de edição do livro de forma descrecente
select nome'Nome', autor'Autor' from LIVRO order by data_edicao desc;

-- Selecionar o nome do livro e a data de edição formatada no formado MM/YY.

select nome'Nome', DATE_FORMAT(data_edicao,'%m/%Y')'Data edição'from LIVRO;

-- •	Selecionar os autores que tiveram livros nas edições entre as datas 01/01/1989 
-- e 31/12/1989 (utilizar between ou >= e <=) 
-- Exemplo: WHERE DATA BETWEEN 
        -- TO_DATE('01/01/2001', 'DD/MM/YYYY') AND 
          -- TO_DATE('31/12/2001');
select autor'Autores' from LIVRO where data_edicao between '1989/01/01' and '1989/12/31';
desc LIVRO;

alter table LIVRO modify nome varchar(50) not null;
alter table LIVRO modify autor varchar(40) not null;
alter table LIVRO modify ano char(4);
alter table LIVRO modify data_edicao datetime not null;

select  * from LIVRO;

insert into LIVRO (nome,autor) values('Cem Anos de Solidão','Gabriel García Márquez');
insert into LIVRO (nome,autor,data_edicao) values('Cem Anos de Solidão','Gabriel García Márquez','1879/06/03');


-- •	Efetuar uma consulta trazendo o nome do livro e somente o ano da edição do livro, ordenando de forma desc do 
-- ano da edição do livro 
-- (ORDER BY TO_CHAR(DATA, ‘YYYY’) DESC

select nome'Nome', date_format(data_edicao,'%Y')'Ano edição' from LIVRO order by data_edicao desc; 

insert into LIVRO values(null,'Chapeuzinho vermelho','1899','Miguel De Cervantes',12);

<<<<<<< HEAD
insert into LIVRO (nome,autor,data_edicao)values('A volta dos que não foram','Liev Tolstói','1789/%M/%d');
=======

insert into LIVRO (nome,autor,data_edicao)values('A volta dos que não foram','Liev Tolstói',STR_TO_DATE('12-01-1789 00:00:00','%m-%d-%Y %H:%i:%s'));
insert into LIVRO (nome,autor,data_edicao)values('Poeira em alto mar','Thomas Mann',STR_TO_DATE('12-01-1809 00:00:00','%m-%d-%Y %H:%i:%s'));
insert into LIVRO (nome,autor,data_edicao)values('Grande visões de um cego','James Joyce',STR_TO_DATE('12-01-1968 00:00:00','%m-%d-%Y %H:%i:%s'));
insert into LIVRO (nome,autor,data_edicao)values('Lucidez de um louco','Gabriel García Márquez',STR_TO_DATE('12-01-1709 00:00:00','%m-%d-%Y %H:%i:%s'));

--  Selecionar apenas os livros sem ano de lançamento e mostrar nos campos o nome do livro e o ano da data de edição
select nome'Nome do livro',date_format(data_edicao,'%Y')'Ano edição'from LIVRO where ano is null ; 

-- •	Alterar os livros sem ano de lançamento inserindo o ano da data de edição do livro
update LIVRO set ano = DATE_FORMAT (data_edicao, '%Y') where ano is null;

-- Alterar a quantidade de páginas dos livros sem valor informado para 100
update LIVRO set qtd_pagina = 100 where qtd_pagina is null;

-- Selecionar a quantidade de autores diferentes na tabela livro
SELECT count(distinct autor)'Quantidade de autores' FROM LIVRO;

-- Selecionar a quantidade de livros que possuem “a” ou “A” no nome
SELECT count(nome)'Quantidade de livros' FROM LIVRO where nome like '%a%' or nome like '%A%';

-- Selecionar a soma de páginas que possuem data de edição maior que 01/01/2005. Incluir apelido na coluna de “Soma de páginas”
SELECT sum(qtd_pagina)'Soma de páginas' FROM LIVRO where data_edicao > '2005/01/01';

-- Alterar a tabela para possui a coluna VALOR para armazenar o valor do livro
alter table LIVRO add column valor float;
desc LIVRO;
select * from LIVRO;

alter table LIVRO modify valor float(5,2);

-- Alterar o valor dos livros dos autores “Miguel De Cervantes”, “Liev Tolstói”, “Thomas Mann” para 35,99.
update LIVRO set valor = 35.99 where autor ='Miguel De Cervantes' or autor = 'Liev Tolstói' or autor = 'Thomas Mann';

-- Alterar o valor dos livros de nome “Em Busca do Templo Perdido”, “O Som e a Fúria”, “Chapeuzinho vermelho”, “Dona florinda” para 12,89
update LIVRO set valor = 12.89 where nome = 'Em Busca do Templo Perdido' or nome = 'O Som e a Fúria' or nome = 'Dona florinda';

-- Alterar o valor dos livros que ainda não possuem valor e possuem data de edição antes de 01/01/2006 para 19,70.
update livro set valor = 19.70 where valor is null and data_edicao < '2006/01/01';

-- Alterar o valor dos demais livros que não possuem valor para 9,99.
update livro set valor = 9.99 where valor is null;

-- Selecionar a média do preço dos livros presentes das tabelas, inserindo um apelido de “media_de_precos”.
SELECT AVG(valor) as media_de_precos FROM LIVRO ;

-- Selecionar o nome do livro, e caso o livro tenha data de edição maior que 01/01/2015 mostrar “O livro é de no máximo dois anos”, 
-- caso contrário, mostrar “O livro é mais velho que dois anos”.
select nome, 
	case 
	when data_edicao > '2015/01/01' then 'O livro é mais velho que dois anos'
	when data_edicao < '2015/01/01' then ' O livro é de no máximo dois anos'
	end as relatorio
from livro;

 -- Selecionar a quantidade de livros por volume. 
 select volume 'VOLUME', count(volume) 'QUANTIDADE' from livro group by volume;


-- Selecionar a quantidade de livros que possuem pelo mês da edição
select count(nome)'LIVRO',date_format(data_edicao , '%M') 'Mês edição' from LIVRO group by date_format(data_edicao , '%M');

-- Selecionar o nome do livro, caso o mesmo possua alguma vogal, mostrar “Possui vogal no nome”, caso contrário mostrar “Não possui vogal no nome”. 
select nome, 
case 
	when (nome LIKE '%a%' 
    OR nome LIKE '%e%'
    OR nome LIKE '%i%'
    OR nome LIKE '%o%'
    OR nome LIKE '%u%') 
    then 'Possui vogal no nome'
	when (nome not LIKE '%a%' 
    OR nome not LIKE '%e%'
    OR nome not LIKE '%i%'
    OR nome not LIKE '%o%'
    OR nome not LIKE '%u%') 
    then 'Não possui vogal no nome'
	end as VOGAL
from livro;

-- Selecionar a média dos valores dos livros que possuem vogal no nome e que não possuem vogal no nome, utilizado o case do exercício anterior
select avg(valor),  
case 
	when (nome LIKE '%a%' 
    OR nome LIKE '%e%'
    OR nome LIKE '%i%'
    OR nome LIKE '%o%'
    OR nome LIKE '%u%') 
    then 'Possui vogal no nome'
	when (nome not LIKE '%a%' 
    OR nome not LIKE '%e%'
    OR nome not LIKE '%i%'
    OR nome not LIKE '%o%'
    OR nome not LIKE '%u%') 
    then 'Não possui vogal no nome'
	end as VOGAL
from livro group by vogal;

      
>>>>>>> 883289bb6c614ec9fc2ac573d10d449fc3e7823a

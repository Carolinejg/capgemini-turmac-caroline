SELECT *
FROM filho f;

-- Mostrar os nomes dos filhos e se possuir m�e, mostrar possui m�e, caso contr�rio mostrar n�o tem m�e, se possui pai, mostrar possui pai, caso contr�rio mostrar n�o tem pai.
SELECT nome'NOME', CASE
WHEN mae_codigo IS NULL THEN 'N�o tem m�e'
WHEN mae_codigo IS NOT NULL THEN 'Tem m�e'
END AS FILIA��O
FROMfilho;


-- Mostrar os nomes dos filhos e o nome da m�e. Trazer todos os filhos independente se possui m�e ou n�o. Se n�o possuir m�e, mostrar no lugar do nome da m�e, n�o tem m�e.
SELECT f.nome 'NOME', CASE WHEN f.mae_codigo IS NULL THEN ' N�o tem m�e'
ELSE m.nome END 'MAE'
FROM filho AS f
LEFT JOIN mae AS m ON
(f.mae_codigo = m.codigo);

-- Mostrar os nomes dos filhos, nome da m�e e nome do pai. Trazer apenas filhos que tenham m�e. Se n�o possui pai, mostrar no lugar do nome da pai, n�o tem pai. 
select f.nome'NOME DO FILHO', m.nome'Nome da m�e',
    CASE
        WHEN f.PAI_CODIGO IS NULL THEN 'N�o tem pai'
ELSE p.NOME 
    END 'Nome do pai'
FROM filho f
INNER JOIN mae m ON
m.CODIGO = f.MAE_CODIGO
LEFT JOIN pai p ONp.CODIGO = f.PAI_CODIGO ;


-- Mostrar a quantidade de filhos que n�o possuem m�e ou n�o possuem pai. 
SELECT count(*) - count(mae_codigo) 'N�o tem m�e', count(*) - count(pai_codigo) 'N�o tem pai' FROM filho;

-- Mostrar o nome do pai e a quantidade de filhos que o pai possui
SELECT p.nome 'NOME', count(pai_codigo) 'Quantidade de Filhos'
FROM filho AS f
INNER JOIN pai AS p ON
(f.pai_codigo = p.codigo)
GROUP BY f.pai_codigo;

-- Mostrar o nome do filho e nome da m�e, ordenando pelo nome da m�e. 
SELECT f.nome 'FILHO', m.nome 'MAE'
FROM filho AS f 
INNER JOIN mae AS m ON (f.mae_codigo = m.codigo)
ORDER BY m.NOME;

-- Mostrar o nome dos filhos que tenham a m�e como Gabriela, Juliana 
SELECT f.NOME 'Nome dos filhos'
FROM filho AS f
INNER JOIN mae AS m ON
m.CODIGO = f.MAE_CODIGO
WHERE m.NOME = 'Gabriela'
OR m.NOME = 'Juliana';

-- Mostrar o nome dos filhos que n�o tenham o pai como Juca, Juliano 
SELECT f.NOME 'Nome dos filhos'
FROM filho AS f
INNER JOIN pai AS p ON
p.CODIGO = f.pai_CODIGO
WHERE p.NOME IN ('Juca', 'Juliano');

-- Mostrar os nomes dos pais que possuem mais de 1 filho.
SELECT nome FROM (SELECT p.nome, count(PAI_CODIGO) AS qtdade 
FROM filho AS f
INNER JOIN pai AS p ON
(f.pai_codigo = p.codigo)
GROUP BY p.NOME) AS principal 
WHERE qtdade > 1;

select p.NOME 'Nome do pai',
CASE WHEN (count() > 1) THEN count()
END 'Quantidade de filho'
FROM filho AS f
INNER JOIN pai AS p     ON
p.CODIGO = f.PAI_CODIGO
GROUP BY p.CODIGO
HAVING count(*) > 1;

-- Mostrar os nomes dos pais e m�e que possuem mais de 1 filho.
SELECT p.NOME 'Nome do pai', m.NOME'Nome da m�e'
FROM filho AS f
INNER JOIN pai p
    ON
p.CODIGO = f.PAI_CODIGO
INNER JOIN mae m 
    ON
m.CODIGO = f.MAE_CODIGO
GROUP BY p.CODIGO, m.CODIGO
HAVING count(f.CODIGO) > 1;
   
-- Mostrar o nome do pai e da m�e, mostrando a quantidade de filhos que tem juntos, ordenando a consulta para trazer os que possuem mais filhos juntos
SELECT mae, pai, count(casal) 'Quantidade filhos'
FROM (SELECT m.nome AS Mae, p.nome AS Pai, concat(f.mae_codigo, f.pai_codigo) AS casal
FROM filho AS f
INNER JOIN mae m ON
m.codigo = f.mae_codigo
INNER JOIN pai p ON
p.codigo = f.pai_codigo) AS principal
GROUP BY casal ORDER BY (count(casal)) DESC;

-- Mostrar os nomes dos pais e m�e, e caso tenha um filho, mostrar �Tem um filho�, caso possua dois filhos mostrar �Tem um casal�, caso tem mais filhos �Eles n�o dormem�.
SELECT mae, pai,  case 
when count(casal) = 1 then 'Tem um filho'
when count(casal) = 2 then 'Tem um casal'
when count(casal) > 2 then 'Eles n�o dormem'
END 'Filhos'
FROM (SELECT m.nome AS Mae, p.nome AS Pai, concat(f.mae_codigo, f.pai_codigo) AS casal
FROM filho AS f
INNER JOIN mae m ON
m.codigo = f.mae_codigo
INNER JOIN pai p ON
p.codigo = f.pai_codigo) AS principal
GROUP BY casal ORDER BY (count(casal)) DESC;


-- Trazer a quantidade de filhos que n�o tem pai e nem m�e.
SELECT count(nome) 'ORF�O'
FROM filho f
WHERE mae_codigo IS NULL
AND pai_codigo IS NULL;


-- Trazer apenas as m�es que n�o tenham filhos
SELECT m.nome 'Nome' FROM mae m LEFT JOIN filho f ON f.mae_codigo = m.codigo WHERE f.CODIGO IS null;

-- Trazer os filhos e o nome do pai, dos filhos que possuem �ri� no nome, ordenando pelo nome do pai decrescente
select f.NOME'Nome do filho', p.NOME'Nome do pai' from filho f 
    inner join pai p 
    on p.CODIGO = f.PAI_CODIGO where f.NOME like '%ri%' 
    order by p.NOME desc;
   
-- Trazer os nomes dos pais, e outra coluna com a quantidade de caracteres que o nome do pai possui 
-- (Exemplo: SELECT LENGTH(�Pedro�) FROM DUAL) vou ver esse
select p.NOME 'Nome',length (p.NOME )'Quantidade de caracteres' from pai p;

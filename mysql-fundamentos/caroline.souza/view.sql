use familia;
create or replace view teste_view as 
SELECT mae, pai, count(casal) 'Quantidade filhos'
FROM (SELECT m.nome AS Mae, p.nome AS Pai, concat(f.mae_codigo, f.pai_codigo) AS casal
FROM filho AS f
INNER JOIN mae m ON
m.codigo = f.mae_codigo
INNER JOIN pai p ON
p.codigo = f.pai_codigo) AS principal
GROUP BY casal ORDER BY (count(casal)) DESC;

select * from teste_view;

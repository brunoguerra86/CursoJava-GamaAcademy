select nome, endereco, tipo from tbl_condominio;

select * from tbl_cliente order by nome desc;

select count(num) from tbl_condominio;

select count(codunidade) from tbl_unidade;

select distinct tipo, count(tipo) from tbl_condominio group by tipo;

select avg(valoraluguel) from tbl_unidade where disponivel = 'S';

select max(valorcondominio) from tbl_unidade;

select * from tbl_unidade where disponivel = 'S' order by valorcondominio desc limit 1;

select * from tbl_unidade where valorcondominio in (select max(valorcondominio) from tbl_unidade);

select * from tbl_cliente where nome like 'P%'

select * from tbl_unidade join tbl_condominio;

select * 
	from tbl_unidade u inner join tbl_condominio c
	on u.numcondominio = c.num;
    
select *
	from tbl_unidade u inner join tbl_cliente c
    on u.idcli = c.idcli

select u.codunidade, co.nome, cl.nome
	from tbl_unidade 			as u 
    inner join tbl_condominio 	as co 	on u.numcondominio 	= co.num
    inner join tbl_cliente 		as cl 	on u.idcli 			= cl.idcli

/* quem aluga o que */
select c.nome, 
       a.valoraluguel, 
       co.nome,
       u.numero, 
       u.complemento, 
       u.valorcondominio
	from tbl_cliente c
	inner join tbl_aluguel a on c.idcli = a.idcli
    inner join tbl_unidade u on u.codunidade = a.codunidade
    inner join tbl_condominio co on u.numcondominio = co.num;

/* quem aluga de quem */
select i.nome as 'Inquilino',
       c.nome,
	   u.numero, 
       u.complemento, 
       a.valoraluguel, 
       u.valorcondominio,
       p.nome 	as 'Proprietário'
from tbl_unidade u
	inner join tbl_aluguel a on u.codunidade = a.codunidade
    inner join tbl_cliente i on a.idcli = i.idcli
    inner join tbl_condominio c on c.num = u.numcondominio
    inner join tbl_cliente p on u.idcli = p.idcli;
use condominio;

insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Isidro', 'isidro@isidro.com', '98765-4321');
insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Jose', 'jose@jose.com', '98765-4321');
insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Pedro', 'pedro@pedro.com', '98765-4321');
insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Maria', 'maria@mauria.com', '98765-4321');
insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Paula', 'paula@paula.com', '98765-4321');
insert into tbl_cliente(idcli, nome, email, telefone) values (null, 'Rosineidson', 'rosi@rosi.com', '98765-4321');
select * from tbl_cliente

insert into tbl_condominio values (null, 'Vila das Flores', 'Rua I', 'C');
insert into tbl_condominio values (null, 'Vila Gourmet', 'Rua II', 'C');
insert into tbl_condominio values (null, 'Sapore del Pasta', 'Rua II', 'A');
insert into tbl_condominio values (null, 'Oz Business Center', 'Rua IV', 'E');
select * from tbl_condominio;

insert into tbl_unidade values (null, 10, null, 'N', 0, 550.0, 1, 1);
insert into tbl_unidade values (null, 11, null, 'N', 0, 550.0, 1, 2);
insert into tbl_unidade values (null, 20, null, 'N', 0, 600.0, 2, 3);
insert into tbl_unidade values (null, 21, null, 'N', 0, 600.0, 2, 4);
insert into tbl_unidade values (null, 101, 'Bloco A', 'S', 850.0, 350.0, 3, 1);
insert into tbl_unidade values (null, 102, 'Bloco A', 'S', 800.0, 350.0, 3, 3);
insert into tbl_unidade values (null, 1001, 'Torre Yara', 'S', 1000.0, 500.0, 4, 2);
insert into tbl_unidade values (null, 1002, 'Torre Yara', 'S', 990.0, 450.0, 4, 4);
select * from tbl_unidade;

insert into tbl_aluguel values(null, 5, 5, '2020-01-01', '2020-12-31',830);
insert into tbl_aluguel values(null, 5, 7, '2020-01-01', '2020-12-31',1000);
insert into tbl_aluguel values(null, 6, 6, '2019-01-01', '2020-12-31',700);
insert into tbl_aluguel values(null, 6, 8, '2020-01-01', '2020-12-31',850);
select * from tbl_aluguel;
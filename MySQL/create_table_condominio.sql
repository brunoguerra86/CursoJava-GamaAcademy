create database condominio;

show databases;

use condominio;

create table tbl_condominio(
	num 		integer			not null auto_increment,
    nome		varchar(100)	not null,
	endereco	varchar(100)	not null,
    tipo		char(1),
    
    constraint pk_condominio primary key (num)
);

alter table tbl_condominio modify endereco varchar(200);

create table tbl_cliente(
	idcli		integer			not null auto_increment,
    nome		varchar(100)	not null,
    email		varchar(80)		not null unique,
    telefone	varchar(20),
    
    constraint pk_cliente primary key (idcli)
);

alter table tbl_cliente modify email varchar(80) not null unique;

create table tbl_unidade(
	codunidade		integer			not null auto_increment,
    numero			integer			not null,
    complemento		varchar(30),
    disponivel		char(1)	,
    valoraluguel	float,
    valorcondominio	float,
    numcondominio	integer			not null,
    idcli			integer			not null,
    
    constraint pk_unidade 	primary key (codunidade),
    constraint fk_cond		foreign key (numcondominio) references tbl_condominio(num),
    constraint fk_cli		foreign key (idcli) 		references tbl_cliente(idcli)
);

create table tbl_aluguel (
	numcontrato		integer	not null auto_increment,
    idcli			integer not null,
    codunidade		integer not null,
    inicio			date, 
    fim				date,
    valoraluguel	float,
    constraint pk_aluguel 	primary key (numcontrato),
    constraint fk_unidade 	foreign key (codunidade) 	references tbl_unidade(codunidade),
    constraint fk_cli_alu	foreign key (idcli) 		references tbl_cliente(idcli)
);



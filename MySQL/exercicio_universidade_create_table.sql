create database universidade;
use universidade;

create table professor(
	numReg    integer not null auto_increment,
	nome      varchar(100),
	titulacao varchar(20),
	cpf       varchar(15),
	email     varchar(50),
	constraint pk_professor primary key (numReg)
);


create table curso(
	idCurso   integer not null auto_increment,
	nomeCurso varchar(50),
	duracao   integer,
	numReg    integer,

	constraint pk_curso primary key (idCurso),
	constraint pk_coord foreign key (numReg) references professor(numReg)
);

create table grade (
	idGrade     integer not null auto_increment,
	portariaDOU varchar(20), 
	anoVigencia integer,
	idCurso     integer,

	constraint pk_grade primary key (idGrade),
	constraint fk_curso foreign key (idCurso) references curso(idCurso)
);

create table disciplina(
	codDisc      integer not null auto_increment,
	titulo       varchar(50),
	cargaHoraria int,
	unidades     text,
	refBiblio    text,
	numReg       integer,

	constraint pk_disciplina primary key (codDisc),
	constraint fk_resp       foreign key (numReg) references professor(numReg)
);

create table ministra(
	numReg    integer,
	codDisc   integer,
	ano       integer,
	semestre  integer,

	constraint pk_ministra primary key (numReg,  codDisc, ano, semestre),
	constraint fk_profes   foreign key (numReg)  references professor(numReg),
	constraint fk_discipl  foreign key (codDisc) references disciplina(codDisc)
);

create table contem(
	idGrade   integer,
	codDisc   integer,
	semestre  integer,

	constraint pk_contem primary key (idGrade, codDisc),
	constraint fk_grade  foreign key (idGrade) references grade(idGrade),
	constraint fk_disc   foreign key (codDisc) references disciplina(codDisc)
);

insert into professor values (null,'Professor Isidro','doutor','111.111.111-11','isidro@uni.com');
insert into professor values (null,'Professor Jose','doutor','222.222.222-22','jose@uni.com');
insert into professor values (null,'Professor Pedro','mestre','333.333.333-33','pedro@uni.com');
insert into professor values (null,'Professora Ana','doutora','444.444.444-44','arnaldo@uni.com');
insert into professor values (null,'Professora Patricia','mestre','555.555.555-55','patricia@uni.com');
insert into professor values (null,'Professor Arnaldo','especialista','666.666.666-66','arnaldo@uni.com');
insert into professor values (null,'Professora Isabel','doutora','777.777.777-77','isabel@uni.com');
insert into professor values (null,'Professor Joao','mestre','888.888.888-88','joao@uni.com');
insert into professor values (null,'Professora Beatriz','especialista','999.999.999-99','beatriz@uni.com');
insert into professor values (null,'Professor Roberto','mestre','101.010.101-01','roberto@uni.com');

insert into curso values (null, 'Ciencia da Computacao',8,2);
insert into curso values (null, 'Sistemas de Informacao',6,4);

insert into grade values (null, '2020/01-987',2020,1);
insert into grade values (null, '2019/02-641',2019,2);

insert into disciplina values (null,'Algoritmos',80,'conteudo de algoritmos','bibliografia de algoritmos',1);
insert into disciplina values (null,'Java I',80,'conteudo de JavaI' ,'bibliografia',1);
insert into disciplina values (null,'Java II',80,'conteudo de Java II','bibliografia',1);
insert into disciplina values (null,'Bancos de Dados',80,'conteudo de BD','bibliografia',2);
insert into disciplina values (null,'Compiladores',80,'conteudo de Compiladores','bibliografia',3);
insert into disciplina values (null,'Engenharia de Software',80,'conteudo de Eng. Software','bibliografia',4);
insert into disciplina values (null,'Grafos',80,'conteudo de Grafos','bibliografia',3);
insert into disciplina values (null,'Calculo',80,'conteudo de Calculo','bibliografia',5);


insert into contem values (1,1,1);
insert into contem values (1,2,2);
insert into contem values (1,3,3);
insert into contem values (1,4,4);
insert into contem values (1,5,5);
insert into contem values (1,6,6);
insert into contem values (1,7,7);
insert into contem values (1,8,8);

insert into contem values (2,1,1);
insert into contem values (2,2,2);
insert into contem values (2,3,3);
insert into contem values (2,4,4);
insert into contem values (2,6,5);
insert into contem values (2,8,6);

insert into ministra values (1,1,2020,1);
insert into ministra values (2,2,2020,1);
insert into ministra values (3,5,2020,1);
insert into ministra values (4,7,2020,1);
insert into ministra values (5,6,2020,1);
insert into ministra values (6,2,2020,1);
insert into ministra values (7,8,2020,1);
insert into ministra values (8,4,2020,1);
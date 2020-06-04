/* quero saber o nome do curso, nome do coordenador e email do coordenador de cada curso */
select nomeCurso, nome as 'coordenador', email from curso inner join professor on
    curso.numReg = professor.numReg;
    
/* quero saber qual a grade vigente de computaÃ§Ã£o */
select * from curso;

/* consigo selecionar todas as disciplinas da grade vigente de um determinado curso, 
bem como o professor responsÃ¡vel e seu email */
select nomeCurso, semestre, titulo, cargaHoraria, nome, email from 
     curso inner join grade on curso.idCurso = grade.idCurso
		   inner join contem on contem.idGrade = grade.idGrade
           inner join disciplina on contem.codDisc = disciplina.codDisc
           inner join professor on disciplina.numReg = professor.numReg
	 where curso.idCurso = 2;
     
     
select * from professor;
select * from ministra;

/* todos os professores que NÃƒO MINISTRAM disciplinas */
select * from professor where numReg not in (select numReg from ministra);

/* todos os professores e suas respectivas disciplinas de responsabilidade,
   mesmo aqueles que nÃ£o possuem disciplinas como responsÃ¡vel */
select * from professor left outer join disciplina on
             professor.numReg = disciplina.numReg;
             
/* usando a clÃ¡usula USING pois ambas as tabelas possuem o mesmo nome de campo e
   a restriÃ§Ã£o Ã© uma igualdade */
select * from professor inner join disciplina using(numReg);
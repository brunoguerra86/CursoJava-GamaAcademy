package br.com.professorisidro.assessment.core;

import java.util.ArrayList;

public class Prova {

	private String aluno;
	private float  nota;
	private ArrayList<QuestaoSimples> questoes;
	
	private int questaoAtual;
	
	public Prova(String aluno, ArrayList<QuestaoSimples> questoes){
		this.aluno = aluno;
		this.questoes = questoes;
		this.questaoAtual = 0;
		this.nota = 0;
	}
	
	public String getAluno() {
		return this.aluno;
	}
	public boolean temQuestoes() {
		return questaoAtual < questoes.size();
	}
	
	public QuestaoSimples buscarQuestaoAtual() {
		return questoes.get(questaoAtual);
	}
	
	public void corrigir(String resp) {
		if (questoes.get(questaoAtual).corrigir(resp)) {
			nota++;
		}
	}
	public void proximaQuestao() {
		questaoAtual++;
	}
	
	public float getNota() {
		return nota/questoes.size() * 100;
	}
}

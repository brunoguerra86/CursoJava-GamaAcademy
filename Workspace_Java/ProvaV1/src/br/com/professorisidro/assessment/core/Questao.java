package br.com.professorisidro.assessment.core;

public class Questao {

	private String enunciado;
	private String resposta;
	
	public Questao(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return this.enunciado;
	}
	
	public boolean corrigir(String respAluno) {
		return resposta.equalsIgnoreCase(respAluno);
	}
	
	
}

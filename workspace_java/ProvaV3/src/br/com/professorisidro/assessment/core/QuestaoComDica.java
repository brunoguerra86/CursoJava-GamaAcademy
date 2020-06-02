package br.com.professorisidro.assessment.core;

public class QuestaoComDica extends QuestaoSimples {
	protected String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String aplicarQuestao() {
		return super.enunciado + "(Dica: " + this.dica + ")";
	}

}

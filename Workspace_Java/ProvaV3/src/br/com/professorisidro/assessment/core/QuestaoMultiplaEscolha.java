package br.com.professorisidro.assessment.core;

public class QuestaoMultiplaEscolha extends QuestaoSimples {

	protected String alternativa1;
	protected String alternativa2;
	protected String alternativa3;
	protected String alternativa4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String a1, String a2, String a3, String a4) {
		super(enunciado, resposta);
		this.alternativa1 = a1;
		this.alternativa2 = a2;
		this.alternativa3 = a3;
		this.alternativa4 = a4;
	}

	public String aplicarQuestao() {
		return (super.enunciado + "\n" + this.alternativa1 + "\n" + this.alternativa2 + "\n" + this.alternativa3 + "\n" + this.alternativa4);
	}

}

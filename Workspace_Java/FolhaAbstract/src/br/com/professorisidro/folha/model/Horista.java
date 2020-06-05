package br.com.professorisidro.folha.model;

public class Horista extends Funcionario {
	protected float valorHora;
	protected int qtdeHoras;

	public Horista(int id, String nome, float valorHora, int qtdeHoras) {
		super(id, nome);
		this.valorHora = valorHora;
		this.qtdeHoras = qtdeHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getQtdeHoras() {
		return qtdeHoras;
	}

	public void setQtdeHoras(int qtdeHoras) {
		this.qtdeHoras = qtdeHoras;
	}

	public float calcularSalario() {
		return valorHora * qtdeHoras;
	}

}

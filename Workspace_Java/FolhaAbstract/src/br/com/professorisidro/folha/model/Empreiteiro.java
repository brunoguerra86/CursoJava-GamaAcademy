package br.com.professorisidro.folha.model;

public class Empreiteiro extends Funcionario {
	protected float valorEmpreita;

	public Empreiteiro(int id, String nome, float valorEmpreita) {
		super(id, nome);
		this.valorEmpreita = valorEmpreita;
	}
	
	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	public float calcularSalario() {
		return valorEmpreita;
	}

}

package br.com.professorisidro.folha.model;

public class Comissionado extends Funcionario {
	protected float salarioBase;
	protected float comissao;

	public Comissionado(int id, String nome, float salarioBase, float comissao) {
		super(id, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float calcularSalario() {
		return salarioBase + salarioBase * comissao / 100;
	}

}

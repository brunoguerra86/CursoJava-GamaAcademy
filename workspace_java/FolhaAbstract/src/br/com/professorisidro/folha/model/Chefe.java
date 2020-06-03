package br.com.professorisidro.folha.model;

public class Chefe extends Funcionario {
	protected float salarioBase;
	protected float adicionalFuncao;
	protected float beneficioTerno;

	public Chefe(int id, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(id, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	public float calcularSalario() {
		return salarioBase + salarioBase * adicionalFuncao / 100 + beneficioTerno;
	}

}

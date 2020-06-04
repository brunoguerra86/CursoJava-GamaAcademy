package br.com.professorisidro.folha.model;

public class Comissionado extends Funcionario {
	
	protected float comissao;
	
	public Comissionado(int id, String nome, float salario, float comissao) {
		super(id, nome, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		// ambas as formas são validas para este exemplo
//		return getSalario()+this.comissao;
		return salario + salario*0.15f + this.comissao;
	}

}

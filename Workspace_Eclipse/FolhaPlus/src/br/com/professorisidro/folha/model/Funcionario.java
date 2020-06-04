package br.com.professorisidro.folha.model;

public class Funcionario {
	protected int    id;
	protected String nome;
	protected float  salario;
	
	public Funcionario(int id, String nome, float salario) {
		this.id      = id;
		this.nome    = nome;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calcularSalario() {
		return this.salario + this.salario*0.10f;
	}
	

}

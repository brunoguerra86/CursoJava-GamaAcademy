package br.com.professorisidro.folha.model;

public abstract class Funcionario {
	protected int    id;
	protected String nome;
	
	public Funcionario(int id, String nome) {
		this.id      = id;
		this.nome    = nome;
	}
	
	public abstract float calcularSalario();
	
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
}

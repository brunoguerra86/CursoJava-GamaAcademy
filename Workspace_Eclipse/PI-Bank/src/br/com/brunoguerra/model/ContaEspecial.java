package br.com.brunoguerra.model;

public class ContaEspecial extends Conta{
	protected float limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, int saldo) {
		super(nomeTitular, cpf, numeroConta, saldo);
	}
	
	public String toString() {
		return "a";
	}
	
	public boolean debitar(float valor) {
		if( (super.saldo+limite) >= valor) {
			saldo -= valor;
			return true;
		}
		else
			return false;
	}
}

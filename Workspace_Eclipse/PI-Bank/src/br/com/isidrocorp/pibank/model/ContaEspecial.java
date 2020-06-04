package br.com.isidrocorp.pibank.model;

public class ContaEspecial extends Conta{
	
	private double limite;

	public ContaEspecial(int numConta, String titular, String cpf, double saldo, double limite) {
		super(numConta, titular, cpf, saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(double valor) {
		if (valor <= super.saldo + this.limite) {
			super.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String toString() {
		return "E:"+super.numConta+" "+super.titular+" ("+super.cpf+")  R$ "
	               +super.saldo+"  R$ "+this.limite;
	}
	
	

}

package br.com.isidrocorp.pibank.model;

public class Conta {
	protected int    numConta;
	protected String titular;
	protected String cpf;
	protected double saldo;
	
	public Conta(int numConta, String titular, String cpf, double saldo) {
		super();
		this.numConta = numConta;
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (valor > saldo) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return numConta+":"+titular+"("+cpf+")"+"  R$ "+saldo;
	}
}

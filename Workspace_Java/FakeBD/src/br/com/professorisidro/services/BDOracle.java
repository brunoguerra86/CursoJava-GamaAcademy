package br.com.professorisidro.services;

public class BDOracle implements InterfaceBD {

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectando no banco ORACLE");
		
	}

	@Override
	public void executar(String comando) {
		// TODO Auto-generated method stub
		System.out.println("oracle> "+comando);
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Desconectado do banco ORACLE");
	}

}

package br.com.professorisidro.services;

public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectando no banco MySQL");
	}

	@Override
	public void executar(String comando) {
		// TODO Auto-generated method stub
		System.out.println("mysql>"+comando);
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Desconectando no banco MySQL");
	}

}

package br.com.professorisidro.services;

public interface InterfaceBD {
	public void conectar();
	public void executar(String comando);
	public void desconectar();
}

package br.com.professorisidro.ui;

import br.com.professorisidro.services.BDMySQL;
import br.com.professorisidro.services.InterfaceBD;

public class SistemaPrincipal {
	public static void main(String args[]) {
		InterfaceBD bd;
		
		bd = new BDMySQL();
		
		bd.conectar();
		bd.executar("Select * from TABELA");
		bd.desconectar();
	}

}

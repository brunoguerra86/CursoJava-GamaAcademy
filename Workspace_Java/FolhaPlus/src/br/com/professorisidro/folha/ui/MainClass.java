package br.com.professorisidro.folha.ui;

import java.util.ArrayList;

import br.com.professorisidro.folha.model.Comissionado;
import br.com.professorisidro.folha.model.Funcionario;
import br.com.professorisidro.folha.model.GerenteDeVendas;

public class MainClass {
	public static void main(String args[]) {

		
		ArrayList<Funcionario> folha;
		folha = new ArrayList<Funcionario>();
		
		folha.add(new Funcionario    (1,"Professor Isidro", 2000.0f));
		folha.add(new Comissionado   (2,"Vendedor Joao   ", 1500.0f, 800.0f));
		folha.add(new GerenteDeVendas(3,"Gerente Jose    ", 2000.0f, 800.0f, 100.0f));
	
		
		for (Funcionario f: folha) {
			System.out.println(f.getId()+"-"+f.getNome()+"  R$ "+f.calcularSalario());
		}
	}

}

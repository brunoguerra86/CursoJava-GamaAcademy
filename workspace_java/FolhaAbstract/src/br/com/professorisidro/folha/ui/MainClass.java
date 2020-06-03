package br.com.professorisidro.folha.ui;

import java.util.HashMap;

import br.com.professorisidro.folha.model.Chefe;
import br.com.professorisidro.folha.model.Comissionado;
import br.com.professorisidro.folha.model.Empreiteiro;
import br.com.professorisidro.folha.model.Funcionario;
import br.com.professorisidro.folha.model.Horista;

public class MainClass {
	public static void main(String args[]) {
		
		// Usando Arraylist Simples
		
//		ArrayList<Funcionario> folha = new ArrayList<Funcionario>();
//
//		folha.add(new Chefe (1,"Chefe Isidro" , 2000.0f, 1000.0f, 100f));
//		folha.add(new Comissionado (2,"Comissionado Joao", 1500.0f, 800.0f));
//		folha.add(new Horista (3,"Horista Jose" , 100.0f , 200)); folha.add(new Empreiteiro (4,"Empreiteiro Pedro", 5000.0f));
//
//		for (Funcionario f: folha) { 
//			System.out.printf("%d - %-20s R$ %.2f\n", f.getId(),f.getNome(),f.calcularSalario()); 
//		} 
		
		// Usando HashMap
		
		HashMap<Integer, Funcionario> func = new HashMap<Integer, Funcionario>();
		
		func.put(1, new Chefe          (1,"Chefe Isidro"     , 2000.0f, 10.0f, 100f));
		func.put(2, new Comissionado   (2,"Comissionado Joao", 1500.0f, 8.0f));
		func.put(3, new Horista        (3,"Horista Jose"     , 160.0f , 20));
		func.put(4, new Empreiteiro    (4,"Empreiteiro Pedro", 5000.0f));
		
		for (Funcionario f: func.values()) {
			System.out.printf("%03d %-20s R$ %8.2f\n", f.getId(),f.getNome(),f.calcularSalario());
		}
	}

}

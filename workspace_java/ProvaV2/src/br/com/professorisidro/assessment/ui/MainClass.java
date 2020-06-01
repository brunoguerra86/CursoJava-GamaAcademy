package br.com.professorisidro.assessment.ui;

import java.util.ArrayList;
import java.util.Collections;


import br.com.professorisidro.assessment.core.Prova;
import br.com.professorisidro.assessment.core.Questao;
import javax.swing.JOptionPane;

public class MainClass {
	public static void main(String args[]) {
		//Scanner teclado = new Scanner(System.in);
		ArrayList<Questao> lista;
		
		lista = new ArrayList<Questao>();
        
		lista.add(new Questao("Quem descobriu o Brasa?", "PA Cabral"));
		lista.add(new Questao("Qual a formula da água?", "H2O"));
		lista.add(new Questao("Quanto é 2+2","4"));
		lista.add(new Questao("Qual a linguagem do nosso curso?", "JAVA"));
		lista.add(new Questao("Qual o proximo feriado?", "Nao sei"));
		
		String resp;
		Prova p1 = new Prova("Zezinho", lista);
		
		//System.out.println("Prova do "+p1.getAluno());
		JOptionPane.showMessageDialog(null, "Prova do "+p1.getAluno());
		while (p1.temQuestoes()) {
			Questao q = p1.buscarQuestaoAtual();
			//System.out.println("Q: "+q.aplicarQuestao());
			//resp = teclado.nextLine();
			resp = JOptionPane.showInputDialog(q.aplicarQuestao());
			p1.corrigir(resp);
			p1.proximaQuestao();
		}
		
		Collections.shuffle(lista);
		Prova p2 = new Prova("Pedrinho", lista);
		
		//System.out.println("Prova do "+p2.getAluno());
		JOptionPane.showMessageDialog(null, "Prova do "+p2.getAluno());
		while (p2.temQuestoes()) {
			Questao q = p2.buscarQuestaoAtual();
			//System.out.println("Q: "+q.aplicarQuestao());
			//resp = teclado.nextLine();
			resp = JOptionPane.showInputDialog(q.aplicarQuestao());
			p2.corrigir(resp);
			p2.proximaQuestao();
		}
		
		JOptionPane.showMessageDialog(null, p1.getAluno()+" "+p1.getNota());
		JOptionPane.showMessageDialog(null, p2.getAluno()+" "+p2.getNota());
		//System.out.println(p1.getAluno()+ "   "+p1.getNota());
		//System.out.println(p2.getAluno()+ "   "+p2.getNota());
	}

}

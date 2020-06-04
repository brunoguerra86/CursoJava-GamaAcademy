package br.com.professorisidro.assessment.ui;

import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.JOptionPane;

import br.com.professorisidro.assessment.core.Questao;

public class Prova {
	public static void main(String args[]) {
//		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Questao> provinha;
		provinha = new ArrayList<Questao>();
		
		// vou colocar varias questoes
		provinha.add(new Questao("Quem descobriu o Brasa?", "PA Cabral"));
		provinha.add(new Questao("Qual a formula da água?", "H2O"));
		provinha.add(new Questao("Quanto é 2+2","4"));
		provinha.add(new Questao("Qual a linguagem do nosso curso?", "JAVA"));
		provinha.add(new Questao("Qual o proximo feriado?", "Nao sei"));
		
		int pontos=0;
		String resp;
		for (Questao q: provinha) {
//			System.out.println("Q: "+q.aplicarQuestao());
//			System.out.print("R: ");
//			resp = teclado.nextLine();
			resp = JOptionPane.showInputDialog(q.aplicarQuestao());
			if (q.corrigir(resp)) {
				pontos++;
			}
		}
		JOptionPane.showMessageDialog(null,"Voce acertou "+pontos+" de "+provinha.size());
//		System.out.println("Voce acertou "+pontos+" de "+provinha.size());
	}

}

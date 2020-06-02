package br.com.professorisidro.assessment.ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.professorisidro.assessment.core.Prova;
import br.com.professorisidro.assessment.core.QuestaoComDica;
import br.com.professorisidro.assessment.core.QuestaoMultiplaEscolha;
import br.com.professorisidro.assessment.core.QuestaoSimples;

public class MainClass {
	public static void main(String args[]) {
		//Scanner teclado = new Scanner(System.in);
		ArrayList<QuestaoSimples> lista;
		
		lista = new ArrayList<QuestaoSimples>();
        
		lista.add(new QuestaoSimples("Qual a linguagem do nosso curso?", "JAVA"));
		lista.add(new QuestaoMultiplaEscolha("Qual maior valor?", "4","1","2","3","4"));
		lista.add(new QuestaoComDica("Quem nasceu primeiro, o ovo ou a galinha?", "Sei lá","Sei lá"));
		
		String resp;
		Prova p1 = new Prova("Zezinho", lista);
		
		//System.out.println("Prova do "+p1.getAluno());
		JOptionPane.showMessageDialog(null, "Prova do "+p1.getAluno());
		while (p1.temQuestoes()) {
			QuestaoSimples q = p1.buscarQuestaoAtual();
			//System.out.println("Q: "+q.aplicarQuestao());
			//resp = teclado.nextLine();
			resp = JOptionPane.showInputDialog(q.aplicarQuestao());
			p1.corrigir(resp);
			p1.proximaQuestao();
		}
		
		JOptionPane.showMessageDialog(null, p1.getAluno()+" "+p1.getNota());
		//System.out.println(p1.getAluno()+ "   "+p1.getNota());
	}

}

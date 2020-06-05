package br.com.isidrocorp.pibank.ui;

import java.util.HashMap;
import java.util.Scanner;

import br.com.isidrocorp.pibank.model.Conta;
import br.com.isidrocorp.pibank.model.ContaEspecial;
import javax.swing.JOptionPane;

public class Agencia {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		HashMap<Integer, Conta> contas;
		int opcao;
		int numConta;
		double valor;
		Conta contaAtual;
		contas = new HashMap<Integer, Conta>();
		
		contas.put(1001, new Conta(1001, "Isidro", "111.222.333-44",1000.0 ));
		contas.put(1002, new Conta(1002, "Jose", "999.888.777-66", 1500.0 ));
		contas.put(1003, new Conta(1003, "Pedro", "987.654.321-00", 2000.0));
		contas.put(2001, new ContaEspecial(2001,"Otavio","222.333.444-55",5000, 1000));
		contas.put(2002, new ContaEspecial(2002,"Valeria","888.765.432-10",10000, 2500));
		
		do {
			//System.out.println(" ***** PI-Bank by IsidroCorp(r) - Seu banco onipresente ***");
			//System.out.println("       1-Info / 2-Deposito / 3-Saque / -1-Encerrar");
			//opcao = teclado.nextInt();
			String txt = JOptionPane.showInputDialog("***** PI-Bank by IsidroCorp(r) - Seu banco onipresente ***\n       1-Info / 2-Deposito / 3-Saque / -1-Encerrar");
			opcao = Integer.parseInt(txt);
			switch(opcao) {
			case 1:
			    //System.out.println("--> Digite o numero da conta");
				txt = JOptionPane.showInputDialog("Digite o numero da conta");
//				numConta = teclado.nextInt();
				numConta = Integer.parseInt(txt);
				contaAtual = contas.get(numConta);
				if (contaAtual != null) {
//					System.out.println("    CONTA: "+ contaAtual);
					JOptionPane.showMessageDialog(null,"Conta: "+contaAtual);
				}
				else {
//					System.out.println(" ----> CONTA INVALIDA");
					JOptionPane.showMessageDialog(null, "Conta Invalida","ERRO",JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 2:
				System.out.println("--> Digite o numero da conta");
				numConta = teclado.nextInt();
				contaAtual = contas.get(numConta);
				if (contaAtual != null) {
					System.out.println(" --> Digite o valor a depositar");
					valor = teclado.nextDouble();
					contaAtual.creditar(valor);
					System.out.println("    CONTA: "+ contaAtual);
				}
				else {
					System.out.println(" ----> CONTA INVALIDA");
				}
				break;
			case 3:
				System.out.println("--> Digite o numero da conta");
				numConta = teclado.nextInt();
				contaAtual = contas.get(numConta);
				if (contaAtual != null) {
					System.out.println(" --> Digite o valor a retirar");
					valor = teclado.nextDouble();
					if (contaAtual.debitar(valor)) {
						System.out.println("   -> Debito efetuado com sucesso");
					}
					else {
						System.out.println("   -> Saldo insuficiente para debito");
					}
					System.out.println("    CONTA: "+ contaAtual);
				}
				break;
			case -1:
				System.out.println("Agradecemos a preferência!");
				break;
			default:
				System.out.println(" *** OPERACAO INVALIDA *** ");
					
			}
			
		} while (opcao != -1);
		
	}

}

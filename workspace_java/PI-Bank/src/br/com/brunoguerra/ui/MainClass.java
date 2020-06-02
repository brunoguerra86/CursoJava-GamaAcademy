package br.com.brunoguerra.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.brunoguerra.model.Conta;

public class MainClass {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		HashMap<Integer, Conta> c;
		c = new HashMap<Integer, Conta>();
		c.put(1234, new Conta("Bruno Guerra", "123.456.789-00", 1234, 100f));
		
		Conta contaAtual = c.get(1234);
		
		//Conta contaAtual = new Conta("Bruno Guerra", "123.456.789-00", 1234, 100f);
		
		int opcao;
		
		float valor;

		do {
			
			System.out.println("1 - Debitar / 2 - Creditar / 3 - Saldo / -1 Sair");
			opcao = Integer.parseInt(teclado.nextLine());

			switch (opcao) {

			case 1:
				System.out.println("Digite o valor a ser debitado: ");
				valor = Float.parseFloat(teclado.nextLine());
				if (contaAtual.debitar(valor))
					System.out.printf("Débito efetuado!\nSaldo atualizado: R$ %.2f\n", contaAtual.getSaldo());
				else
					System.out.printf("Saldo insuficiente!\nSaldo atualizado: R$ %.2f\n", contaAtual.getSaldo());
				break;

			case 2:
				System.out.println("Digite o valor a ser creditado: ");
				valor = Float.parseFloat(teclado.nextLine());
				contaAtual.creditar(valor);
				System.out.printf("Crédito efetuado!\nSaldo atualizado: R$ %.2f\n", contaAtual.getSaldo());
				break;

			case 3:
				System.out.printf("Saldo atualizado: R$ %.2f\n", contaAtual.getSaldo());
				break;

			case -1:
				System.out.println("Até mais!");
				break;

			default:
				System.out.println("ERRO - Opcao inválida");
				break;
			}
		} while (opcao != -1);

	}

}

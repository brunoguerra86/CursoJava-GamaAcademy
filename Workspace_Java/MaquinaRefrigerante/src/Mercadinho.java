import java.util.Scanner;
public class Mercadinho {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		MaquinaDeRefri maq = new MaquinaDeRefri();
		int opcao;
		float valor;
		
		do {
			maq.exibirDisplay();
			System.out.print("100 para inserir credito / 200 para troco / (#) para comprar refri / -1 para sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 100:
				System.out.println("Qual o valor?");
				valor = teclado.nextFloat();
				maq.inserirCredito(valor);
				break;
			case 200:
				valor = maq.retornarTroco();
				System.out.println("Retire seu troco no valor de R$ "+valor);
				break;
			case 0:
			case 1:
			case 2:
				int res = maq.comprar(opcao);
				if (res == 0) {
					System.out.println("Compra Efetuada! Aproveite");
				}
				else if (res == -1) {
					System.out.println("*** Sem Estoque ***");
				}
				else {
					System.out.println("*** Credito Insuficiente ***");
				}
				break;
			case -1:
				System.out.println("Até mais!!!");
				break;
			default:
				System.out.println("Opcao invalida");
			
			}
		} while (opcao != -1);
		
		teclado.close();	
	}
}

import java.util.Scanner;
import java.util.ArrayList;

public class MainERP {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		String txtNome;
		int vlId, vlQtde;
		float vlPreco;
				
		int opcao;
		
		do {
			System.out.println("1 - Cadastrar / 2 - Buscar por ID / 3 - Listar tudo / -1 Sair");
			opcao = Integer.parseInt(teclado.nextLine());
					
			switch(opcao) {
			
			case 1:
				System.out.println(" --> Cadastro de novo produto <-- ");
				System.out.println("Digite id / nome / preco / qtde");
				
				//leia do teclado e faça as devidas conversões
				vlId = Integer.parseInt(teclado.nextLine());
				txtNome = teclado.nextLine();
				vlPreco = Float.parseFloat(teclado.nextLine());
				vlQtde = Integer.parseInt(teclado.nextLine());
				
				//cria um objeto do tipo "Produto" com os dados digitados
				Produto p = new Produto(vlId, txtNome, vlPreco, vlQtde);
				
				//adiciona na lista
				lista.add(p);
				
				break;
			
			case 2:
				System.out.println("---> Buscando Produtos <---");
				System.out.println("Digite o ID:");
				vlId = Integer.parseInt(teclado.nextLine());
				
				// aqui é a busca
				Produto busca = null;
				for (int pos=0; pos < lista.size(); pos++) {
					Produto tmp = lista.get(pos);
					if (tmp.getId() == vlId) { // meu objeto temporário tem o id q eu busco
						busca = tmp;           // atribuo esse temporário para o objeto q vou exibir
					    break;                 // interrompe a repeticao
					}
				}
				if (busca != null) {
					System.out.println("Encontrado! "+busca.getId()+" - "+busca.getTitulo()+" R$ "+busca.getPreco()+" | "+busca.getQtde());
				}
				else {
					System.out.println(" *** Desculpe, produto não encontrado!");
				}
				
				break;
			
			case 3:
				System.out.println("--->  Listando produtos <---");
				for (int pos=0; pos < lista.size(); pos++) {
					Produto p1= lista.get(pos);  // equivale ao lista[pos] do vetor comum;
					if (p1 != null) {
						System.out.println("    "+p1.getId()+" "+p1.getTitulo()+" R$ "+p1.getPreco());
					}
				}
				break;
			
			case -1:
				System.out.println("Optou por sair");
				break;
			
			default:
				System.out.println("ERRO - Opcao inválida");
				break;
			}
		}while (opcao != -1);
		
	}
}

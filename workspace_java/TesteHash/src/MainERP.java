import java.util.HashMap;
import java.util.Scanner;

public class MainERP {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int id,qtde;
		float preco;
		String nome;

		HashMap<Integer, Produto> mapa;

		mapa = new HashMap<Integer, Produto>();

		int opcao;

		do {
			System.out.println("1 - Cadastro / 2 - Busca / -1 - Encerra");
			opcao = Integer.parseInt(teclado.nextLine());
			
			switch (opcao) {
			case 1:
				System.out.println("Digite id / nome / preco / qtde");
				
				//leia do teclado e faça as devidas conversões
				id    = Integer.parseInt(teclado.nextLine());
				nome  = teclado.nextLine();
				preco = Float.parseFloat(teclado.nextLine());
				qtde  = Integer.parseInt(teclado.nextLine());
				
				//cria um objeto do tipo "Produto" com os dados digitados
				Produto p = new Produto(id, nome, preco, qtde);
				
				//adiciona na lista
				mapa.put(p.getId(),p);
				
				break;
			
			case 2:
				System.out.println("---> Buscando Produtos <---");
				System.out.println("Digite o ID:");
				id = Integer.parseInt(teclado.nextLine());
				
				// internamente o get calcula a posição baseada no valor de id e retorna
				// o objeto. Se a posição estiver vazia, retorna NULL
				Produto busca = mapa.get(id);
				
				if (busca == null)
					System.out.println(" *** Desculpe, produto não encontrado!");
				else
					System.out.println("Encontrado! "+busca.getId()+" - "+busca.getTitulo()+" R$ "+busca.getPreco()+" | "+busca.getQtde());
				
				break;
			
			case -1:
				System.out.println("Encerrando programa...");
				break;
			
			default:
				System.out.println("Erro - Opção Invalida");
			}

		} while (opcao != -1);

		teclado.close();
	}

}

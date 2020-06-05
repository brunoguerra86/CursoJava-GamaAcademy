import java.util.ArrayList;
import java.util.HashMap;

public class Benchmark {
	public static void main(String args[]) {

		// ====================================================================================================
		/* teste 1 - com ArrayList */
		// ====================================================================================================

		ArrayList<Produto> lista;

		lista = new ArrayList<Produto>();

		for (int i = 0; i < 100000; i++) {
			Produto p = new Produto(i + 1, "Produto " + (i + 1), 0, 0);
			lista.add(p);
		}

		// vou fazer um loop de 1000 buscas na lista (os produtos não existem)
		int quantosAchei = 0;

		long inicio = System.currentTimeMillis();
		Produto busca;
		for (int cont = 0; cont < 10000; cont++) {
			for (int i = 0; i < lista.size(); i++) {
				Produto tmp = lista.get(i);
				if (tmp.getId() == -1) {  // to forçando um id que não existe na lista justamente pra não encontrar
					busca = tmp;
					quantosAchei++;
					break;
				}
			}
		}
		long fim = System.currentTimeMillis();
	
		System.out.println("Achei = " + quantosAchei +" em "+(fim-inicio));
		
		
		// ====================================================================================================
		/* teste 2 - com HashMap */
		// ====================================================================================================
		
		/*
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		for (int i = 0; i < 1000000; i++) {
			Produto p = new Produto(i + 1, "Produto " + (i + 1), 0, 0);
			mapa.put(p.getId(), p);
		}
		
		int quantosAchei=0;
		long inicio = System.currentTimeMillis();
		for (int cont=0; cont< 10000; cont++) {
			Produto busca = mapa.get(-1);
			if (busca != null) {
				quantosAchei++;
			}
		}
		long fim    = System.currentTimeMillis();
		System.out.println("Achei = "+quantosAchei+" em "+(fim-inicio));
		*/

	}

}
import java.util.ArrayList;

public class MaquinaDeRefri {
	
	private ArrayList<Refrigerante> lista;
	private float credito;
	
	public MaquinaDeRefri() {
		lista = new ArrayList<Refrigerante>();
		
		// inserir 3 refris
		/*
		Refrigerante r1 = new Refrigerante("Coca cola", 2.50f, 5);
		Refrigerante r2 = new Refrigerante("Fanta", 1.50f, 5);
		Refrigerante r3 = new Refrigerante("Pepsi", 1.80f, 5);
		
		lista.add(r1);
		lista.add(r2);
		lista.add(r3);
		*/
		
		// ou senão....
		lista.add(new Refrigerante("Coca cola", 2.50f, 5));
		lista.add(new Refrigerante("Fanta    ", 1.50f, 5));
		lista.add(new Refrigerante("Pepsi    ", 1.80f, 5));
		this.credito = 0.0f;
	}
	
	public void inserirCredito(float valor) {
		this.credito += valor;
	}
	
	public void exibirDisplay() {
		System.out.println(" *** Maquina de REFRI ***");
		System.out.println(" CREDITO R$ "+credito);
		for (int i=0; i<lista.size(); i++) {
			System.out.println(i+"  "+lista.get(i).getNome()+"  R$ "+lista.get(i).getPreco());
		}
	}
	
	public int comprar(int numRefri) {
		int resultado;
		if (credito >= lista.get(numRefri).getPreco()) {
			if (lista.get(numRefri).getQtd() > 0 ) {
				// atualizo o credito, debitando o valor do refri
				credito = credito - lista.get(numRefri).getPreco();
				
				// atualizo o estoque (pego a qtde atual, diminuo e atribuo para a nova qtde)
				int novaQtde = lista.get(numRefri).getQtd();
				novaQtde--;
				lista.get(numRefri).setQtd(novaQtde);
					
				resultado = 0; // deu certo a compra!!!
			}
			else {
				resultado = -1; // tem credito mas não tem estoque
			}
		}
		else {
			resultado = -2; // nao tem credito;
		}
		return resultado;
	}
	
	public float retornarTroco() {
		float troco = credito;
		credito = 0;
		return troco;
	}
	
	

}

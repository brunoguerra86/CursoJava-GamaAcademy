
public class Produto {
	private int id;
	private String titulo;
	private float preco;
	private int qtde;
	
	public Produto(int id, String titulo, float preco, int qtde) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.preco = preco;
		this.qtde = qtde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
}

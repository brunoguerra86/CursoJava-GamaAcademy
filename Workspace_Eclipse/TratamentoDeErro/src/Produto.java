
public class Produto {

	private int codigo;
	private String descricao;
	private float preco;
	private int estoque;

	public Produto(int codigo, String descricao, float preco, int estoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo < 0)
			throw new IsiException("Valor não pode ser negativo");
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.length() == 0)
			throw new IsiException("Descrição não pode ser vazio");
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco <0)
			throw new IsiException("Valor não pode ser negativo");
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", estoque=" + estoque + "]";
	}
}

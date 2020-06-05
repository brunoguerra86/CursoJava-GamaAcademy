package br.com.professorisidro.paintbrush.core;

public abstract class FormaGeometrica {
	protected int posX;
	protected int posY;
	protected int altura;
	protected int largura;
	
	public FormaGeometrica(int posX, int posY, int altura, int largura) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.altura = altura;
		this.largura = largura;
	}
	
	
	public abstract void desenhar();
	// métodos abstratos não tem corpo (não tem lógica dentro dele)
	// eu apenas criei uma "cláusula contratual" para quem for herdar de FormaGeométrica

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
}

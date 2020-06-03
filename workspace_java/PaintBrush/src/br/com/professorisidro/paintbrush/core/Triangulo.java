package br.com.professorisidro.paintbrush.core;

public class Triangulo extends FormaGeometrica{

	public Triangulo(int posX, int posY, int altura, int largura) {
		super(posX, posY, altura, largura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("Desenho triangulo");
	}
}

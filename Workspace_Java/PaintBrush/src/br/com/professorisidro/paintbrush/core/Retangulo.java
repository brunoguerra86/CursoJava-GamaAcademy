package br.com.professorisidro.paintbrush.core;

public class Retangulo extends FormaGeometrica{

	public Retangulo(int posX, int posY, int altura, int largura) {
		super(posX, posY, altura, largura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("Desenho retangulo");
	}
}

package br.com.professorisidro.paintbrush.ui;

import br.com.professorisidro.paintbrush.core.FormaGeometrica;
import br.com.professorisidro.paintbrush.core.Retangulo;

public class PaintBrush {

	public static void main(String[] args) {
		FormaGeometrica g = new Retangulo(10,20,10,20);
		
		g.desenhar();

	}

}

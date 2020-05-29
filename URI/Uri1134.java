import java.util.Scanner;

public class Uri1134 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a = 0, g = 0, d = 0, x;

        while ( (x = teclado.nextInt()) != 4) {
            switch (x) {
                case 1: a++; break;
                case 2: g++; break;
                case 3: d++; break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
}
import java.util.Scanner;

public class Uri1041 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float x, y;

        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x == 0 && y == 0)
            System.out.println("Origem");
        else{
            if (x == 0)
                System.out.println("Eixo Y");
            if (y == 0)
                System.out.println("Eixo X");
        }

        if (x > 0) {
            if (y > 0)
                System.out.println("Q1");
            if (y < 0)
                System.out.println("Q4");
        }

        if (x < 0) {
            if (y > 0)
                System.out.println("Q2");
            if (y < 0)
                System.out.println("Q3");
        }

    }
}
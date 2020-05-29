import java.util.Scanner;

public class Uri1115 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, y;

        while (true) {
            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x == 0 || y == 0)
                break;

            if (x > 0) {
                if (y > 0)
                    System.out.println("primeiro");
                if (y < 0)
                    System.out.println("quarto");
            }

            if (x < 0) {
                if (y > 0)
                    System.out.println("segundo");
                if (y < 0)
                    System.out.println("terceiro");
            }
        }
    }
}
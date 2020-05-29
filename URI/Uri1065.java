import java.util.Scanner;

public class Uri1065 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, pares = 0;

        for (int x = 1; x <= 5; x++) {
            a = teclado.nextInt();

            if (a % 2 == 0) 
                pares += 1;
        }
        System.out.printf("%d valores pares\n", pares);
    }
}
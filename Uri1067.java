import java.util.Scanner;

public class Uri1067 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x;

        x = teclado.nextInt();

        for (int a = 1; a <= x; a++) {
            if (a % 2 == 1) 
                System.out.println(a);
        }
    }
}
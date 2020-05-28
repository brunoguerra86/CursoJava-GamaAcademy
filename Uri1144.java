import java.util.Scanner;

public class Uri1144 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();

        for (int a = 1; a <= x; a++) {
            System.out.println(a + " " + a * a + " " + a * a * a);
            System.out.println(a + " " + (a * a + 1) + " " + (a * a * a + 1));
        }
    }
}
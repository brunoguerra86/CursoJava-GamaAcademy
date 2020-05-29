import java.util.Scanner;

public class Uri1142 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();

        for (int a = 1; a <= x * 4; a++) {
            if (a % 4 != 0)
                System.out.print(a + " ");
            else
                System.out.println("PUM");
        }
    }
}
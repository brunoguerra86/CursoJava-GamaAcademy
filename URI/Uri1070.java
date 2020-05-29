import java.util.Scanner;

public class Uri1070 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();

        if (x % 2 == 0)
            x++;

        for (int a = x; a < x + 12; a += 2)
            if (a % 2 == 1)
                System.out.println(a);
    }
}
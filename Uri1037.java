import java.util.Scanner;

public class Uri1037 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float A;

        A = teclado.nextFloat();

        if (A >= 0 && A <= 25)
            System.out.println("Intervalo [0,25]");

        if (A > 25 && A <= 50)
            System.out.println("Intervalo (25,50]");

        if (A > 50 && A <= 75)
            System.out.println("Intervalo (50,75]");

        if (A > 75 && A <= 100)
            System.out.println("Intervalo (75,100]");

        if (A < 0 || A > 100)
            System.out.println("Fora de intervalo");
    }
}
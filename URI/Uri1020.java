import java.util.Scanner;

public class Uri1020 {
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);

        int dias, a, m, d, resto;

        dias = teclado.nextInt();

        a = dias / 365;
        resto = dias % 365;
        m = resto / 30;
        d = resto % 30;

        System.out.println(a + " ano(s)\n" + m + " mes(es)\n" + d + " dia(s)");
    }
}
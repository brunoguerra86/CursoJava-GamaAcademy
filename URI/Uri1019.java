import java.util.Scanner;

public class Uri1019 {
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);

        int secs, h, m, s, resto;

        secs = teclado.nextInt();

        h = secs / 3600;
        resto = secs % 3600;
        m = resto / 60;
        s = resto % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
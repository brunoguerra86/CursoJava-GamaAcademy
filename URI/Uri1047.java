import java.util.Scanner;

public class Uri1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int h1, h2, m1, m2, htotal, mtotal;

        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();

        if (h1 < h2)
            htotal = h2 - h1;
        else
            htotal = 24 + h2 - h1;

        if (m1 < m2)
            mtotal = m2 - m1;
        else {
            mtotal = 60 + m2 - m1;
            htotal -= 1;
        }

        if (mtotal == 60) {
            htotal += 1;
            mtotal -= 60;
        }

        if (htotal == 24 && mtotal > 0)
            htotal = 0;

        System.out.println("O JOGO DUROU " + htotal + " HORA(S) E " + mtotal + " MINUTO(S)");
    }
}
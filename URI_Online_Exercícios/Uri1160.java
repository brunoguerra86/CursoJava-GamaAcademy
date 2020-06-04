import java.util.Scanner;

public class Uri1160 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int T = teclado.nextInt();
        int PA, PB;
        double G1, G2;
        int ano = 0;

        for (int a = 1; a <= T; a++) {
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextFloat();
            G2 = teclado.nextFloat();

            ano = 0;

            while (PA <= PB) {
                PA = PA + (int) (PA * G1 / 100);
                PB = PB + (int) (PB * G2 / 100);
                ano++;

                if (ano > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (ano <= 100)
                System.out.println(ano + " anos.");
        }
    }
}
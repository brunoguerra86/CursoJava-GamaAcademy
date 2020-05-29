import java.util.Scanner;

public class Uri1066 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, par = 0, imp = 0, pos = 0, neg = 0;

        for (int x = 1; x <= 5; x++) {
            a = teclado.nextInt();

            if (a % 2 == 0)
                par += 1;
            else
                imp += 1;

            if (a > 0)
                pos += 1;

            if (a < 0)
                neg += 1;
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
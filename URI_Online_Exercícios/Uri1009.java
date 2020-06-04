import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double fixo, vendas, total;

        nome = teclado.next();
        fixo = teclado.nextDouble();
        vendas = teclado.nextDouble();

        total = fixo + vendas * 0.15f;

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
import java.util.Scanner;

public class Uri1038 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int item, qtd;
        Float total;

        item = teclado.nextInt();
        qtd = teclado.nextInt();

        switch (item) {
            case 1:
                total = 4.00f * qtd;
                break;
            case 2:
                total = 4.50f * qtd;
                break;
            case 3:
                total = 5.00f * qtd;
                break;
            case 4:
                total = 2.00f * qtd;
                break;
            case 5:
                total = 1.50f * qtd;
                break;
            default:
                total = 0f;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
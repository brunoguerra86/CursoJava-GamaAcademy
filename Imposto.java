
//Exercício 17 - Lista Algoritmos-Java.pdf
import java.util.Scanner;

public class Imposto {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float salBruto, salLiquido, imposto;

        salBruto = teclado.nextFloat();

        switch (salBruto) {
            case <= 1000:
                imposto = 0;
                break;
            case <= 2500:
                imposto = salBruto * 0.125f;
                break;
            case <= 5000:
                imposto = salBruto * 0.25f;
                break;
            default:
                imposto = 1300;
        }
        salLiquido = salBruto - imposto;

        System.out.println("O imposto é        : R$ " + imposto);
        System.out.println("O Salário Líquido é: R$ " + imposto);
    }
}
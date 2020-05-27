
//Exercício 20 - Lista Algoritmos-Java.pdf
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float H, pesoIdeal;
        int Sexo;

        System.out.println("Digite sua altura:");
        H = teclado.nextFloat();

        System.out.println("Digite seu sexo (0-Masculino ou 1-Feminino):");
        Sexo = teclado.nextInt();

        if (Sexo == 0) {
            pesoIdeal = (72.7f * H) - 58;

        } else {
            pesoIdeal = (62.1f * H) - 44.7f;
        }
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
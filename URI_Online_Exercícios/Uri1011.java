import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi, volume, raio;

        raio = teclado.nextDouble();

        pi = 3.14159;

        volume = (4.0 / 3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
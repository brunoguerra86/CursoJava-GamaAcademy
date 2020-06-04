import java.util.Scanner;

public class Uri2313 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        // Regra Triangulo
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            if ((a > Math.abs(b - c)) && (b > Math.abs(a - c)) && (c > Math.abs(a - b))) {
                if (a == b && b == c){
                    System.out.println("Valido-Equilatero");
                }
                else {
                    if ((a == b) || (b == c) || (c == a))
                        System.out.println("Valido-Isoceles");
                    else
                        System.out.println("Valido-Escaleno");
                }

                if (((a * a) == (b * b) + (c * c)) || ((b * b) == (a * a) + (c * c)) || ((c * c) == (b * b) + (a * a)))
                    System.out.println("Retangulo: S");
                else
                    System.out.println("Retangulo: N");
            }
        } else {
            System.out.println("Invalido");
        }
    }
}
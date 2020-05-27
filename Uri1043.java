import java.util.Scanner;

public class Uri1043 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float a, b, c;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        // Regra Triangulo
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            if ((a > Math.abs(b - c)) && (b > Math.abs(a - c)) && (c > Math.abs(a - b))) {
                System.out.println("Perimetro = " + (a + b + c));
            }
        }
        else{
            System.out.println("Area = " + ((a+b)*c/2));
        }
    }
}
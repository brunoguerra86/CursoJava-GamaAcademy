import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        Float salBruto, imposto;

        salBruto = teclado.nextFloat();
        imposto = 0f;

        if (salBruto <= 2000)
            System.out.println("Isento");
        else {
            if (salBruto <= 3000)
                imposto = imposto + (salBruto - 2000.00f) * 0.08f;
            else {
                if (salBruto <= 4500) {
                    imposto = imposto + (1000f) * 0.08f;
                    imposto = imposto + (salBruto - 3000.00f) * 0.18f;
                }
                else{
                    if (salBruto > 4500) {
                        imposto = imposto + (1000f) * 0.08f;
                        imposto = imposto + (1500f) * 0.18f;
                        imposto = imposto + (salBruto - 4500f) * 0.28f;
                    }
                }
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
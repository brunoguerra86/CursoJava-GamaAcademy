import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o valor de a: ");
		a = teclado.nextInt();
		System.out.println("Digite o valor de b: ");
		b = teclado.nextInt();

		c = a + b;

		System.out.println("Primeiro teste no eclipse");
		System.out.println("Valor de C = " + c);

		teclado.close();
	}
}

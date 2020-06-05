import java.util.Scanner;

public class EmpregadoTeste {
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(String.in);

		Empregado lista[];

		lista = new Empregado[10];

		lista[0] = new Empregado("Isidro", "Patrão", 25000);
		lista[1] = new Empregado("Isidro", "Patrão", 25000);

		System.out.println(lista[0].getNome() + "R$ " + lista[0].getSalario());
		System.out.println(lista[1].getNome() + "R$ " + lista[1].getSalario());

		lista[0].aumentarSalario(10.0);
		lista[1].aumentarSalario(15.0);
		
		System.out.println(lista[0].getNome() + "R$ " + lista[0].getSalario());
		System.out.println(lista[1].getNome() + "R$ " + lista[1].getSalario());
	}
}

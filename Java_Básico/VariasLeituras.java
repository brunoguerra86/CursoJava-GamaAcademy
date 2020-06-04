import java.util.Scanner;

public class VariasLeituras {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        String nome;

        //Nesta abordagem o <enter> do número entra como entrada para a segunda leitura
        /*
        System.out.println("Digite seu numero");
        numero = teclado.nextInt();

        System.out.println("Digite seu nome");
        nome = teclado.nextLine();

        System.out.println("Seu número/nome digitado: " + numero + "/" + nome);
        */

        //Quando necessário ler Número e Texto alternadamente, 
        //usar leitura sempre Texto e converter quando necessário
        String txtNumero;
        
        System.out.println("Digite seu numero");
        txtNumero = teclado.nextLine();
        numero = Integer.parseInt(txtNumero);
    }
}
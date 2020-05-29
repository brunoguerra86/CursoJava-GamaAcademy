import java.util.Scanner;
public class AppQueUsaTV{
    public static void main(String args[]){
        int opcao;
        Scanner teclado = new Scanner(System.in);

        Televisao t = new Televisao("Samsung",50,110,"Smart");

        do{
            System.out.println("1 Liga / 0 Desliga / 2 Aumenta Canal / -2 Volta canal / 3 aumenta volume / -3 diminui volume ");
            opcao = teclado.nextInt();

            switch(opcao){
                case 0:
                  t.desligar(); break;
                case 1:
                  t.ligar(); break;
                case 2:
                  t.avancarCanal(); break;
                case -2: 
                  t.voltarCanal(); break;
                case 3:
                  t.aumentarVolume(); break;
                case -3:
                  t.diminuirVolume(); break;
                case -1:
                  System.out.println("Tchau!"); break;
                default:
                  System.out.println("Botao nao existe"); break;
            }
            t.exibirInfo();

        } while (opcao != -1);

        
    }
}
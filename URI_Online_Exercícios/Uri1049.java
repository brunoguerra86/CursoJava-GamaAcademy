import java.util.Scanner;

public class Uri1049 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String p1,p2,p3;

        p1 = teclado.nextLine();
        p2 = teclado.nextLine();
        p3 = teclado.nextLine();

        if(p1.equals("vertebrado")){
            if(p2.equals("ave")){
                if(p3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else if(p3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }
            else if(p2.equals("mamifero")){
                if(p3.equals("onivoro")){
                    System.out.println("homem");
                }
                else if(p3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        } 
        else if (p1.equals("invertebrado")){
            if(p2.equals("inseto")){
                if(p3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if(p3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }
            else if(p2.equals("anelideo")){
                if(p3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if(p3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
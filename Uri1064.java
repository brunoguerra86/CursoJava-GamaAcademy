import java.util.Scanner;

public class Uri1064 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float a, media=0;
        int positivos=0;

        for (int x = 1; x <= 6; x++) {
            a = teclado.nextFloat();
            
            if (a > 0){
                positivos += 1;
                media += a;
            }
        }
        media /= positivos;

        System.out.printf("%d valores positivos\n%.1f\n",positivos, media);
    }
}
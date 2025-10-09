package Pitagoras;
import java.util.Scanner;
public class testePitagoras {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.printf("Informe, respectivamente, os valores da hipotenusa, Cateto adj. e Cateto opo.: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        funcTriangle teste = new funcTriangle(a, b, c);
        teste.imprime();

        input.close();
    }
}

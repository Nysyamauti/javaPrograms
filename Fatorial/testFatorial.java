package Fatorial;
import java.util.Scanner;
public class testFatorial {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
        int qt;
        System.out.print("Informe um número: ");
        qt = input.nextInt();
        funcFatorial teste = new funcFatorial();
        System.out.printf("O fatorial do valor %d é %d", qt, teste.setFatorial(qt));

        input.close();
    }
}

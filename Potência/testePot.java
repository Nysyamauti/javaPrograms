package Potência;
import java.util.Scanner;
public class testePot {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int expoente, valor;
        
        System.out.print("Informe o expoente: ");
        expoente = input.nextInt();
        System.out.print("Informe um valor: ");
        valor = input.nextInt();

        funcPot teste = new funcPot();
        System.out.printf("O resultado de %d elevado a potência de %d é %d", 
        valor, expoente, teste.potencia(valor, expoente));

        input.close();
    }
}

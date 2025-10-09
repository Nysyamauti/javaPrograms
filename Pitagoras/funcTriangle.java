package Pitagoras;
import java.util.Scanner;
public class funcTriangle {
    private Scanner add = new Scanner(System.in);
    private int a, b, c;
    public funcTriangle(int a, int b, int c){
        setHipotenusa(a);
        setAdjacente(b);
        setOposto(c);
    }
    public void setHipotenusa(int a){
        while(a<=0){
            a = add.nextInt();
            this.a = a;
        }
        this.a = a;
    }
    public void setAdjacente(int b){
         while(b<=0){
            b = add.nextInt();
            this.b = b;
        }
        this.b = b;
    }
    public void setOposto(int c){
         while(c<=0){
            c = add.nextInt();
            this.c = c;
        }
        this.c = c;
    }
    public boolean setTriangle(){
        if(a+b<c || a+c<b || b+c<a) return false;
        else return true;
    }
    public void calcSeno(){
        System.out.printf("Seno: %d/%d\n", c, a);
    }
    public void calcCoss(){
        System.out.printf("Cosseno: %d/%d\n", b, a);
    }
    public void calcTang(){
        System.out.printf("Tangente: %d/%d\n", c, b);
    }
    public void imprime(){
        if(setTriangle()){
            if(a*a < ((b*b)+(c*c))) System.out.print("A soma dos quadros dos catetos deve se igual ao quadrado da hipotenusa!");
            else{
                calcSeno();
                calcCoss();
                calcTang();
            }
        }
    }
}

package Potência;
public class funcPot {
    public int potencia(int val, int exp){
        if(exp==0) return 1;
        return val * potencia(val, exp-1);
    }
}

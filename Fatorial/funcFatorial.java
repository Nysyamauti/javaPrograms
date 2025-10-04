package Fatorial;
public class funcFatorial {
    public int setFatorial(int num) {
        if(num<2) return 1;
        else return num * setFatorial(num-1);
    }
}

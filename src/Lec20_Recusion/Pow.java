package Lec20_Recusion;

public class Pow {
    public static int powe(int a,int b){
        if(b==0){
            return 1;
        }
        return a*powe(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(powe(a,b));
    }
}

package Lec21;

public class Fibo {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);//n-1th
        int f2=fib(n-2);//n-2th
        return f1+f2;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}

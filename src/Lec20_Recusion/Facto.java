package Lec20_Recusion;

public class Facto {
    public static int fact(int n){
        //base case - break point og recussion
        if( n==0){
            return 1;
        }
        //sp n-1
        int fn=fact(n-1);//recusion (n-1)!
        return fn*n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}

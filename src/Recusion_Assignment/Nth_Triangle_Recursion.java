package Recusion_Assignment;

import java.util.Scanner;

public class Nth_Triangle_Recursion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nth(n));
    }
    public static int nth(int n){
        if(n==0 || n==1){
            return n;
        }
        return n+nth(n-1);
    }
}

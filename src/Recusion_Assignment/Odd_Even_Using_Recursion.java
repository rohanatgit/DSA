package Recusion_Assignment;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       evenodd(n);
    }
    public static void evenodd(int n){
        if(n==0){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        evenodd(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}

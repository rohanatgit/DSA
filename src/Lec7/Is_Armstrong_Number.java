package Lec7;

import java.util.Scanner;

public class Is_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Is_Armstrong_number(n));
    }
    public static boolean Is_Armstrong_number(int n){
        int d=countofDigit(n);

        int ans=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
        ans=(int)(ans+Math.pow(rem,d));
        n=n/10;}
        if(temp==ans){
            return true;
        }
        return false;
    }
    public static int countofDigit(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
}

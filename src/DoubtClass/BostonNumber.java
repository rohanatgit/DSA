package DoubtClass;

import java.util.Scanner;

public class BostonNumber {
    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        return sum;
    }
    public static int BostonNumber(int n){
        int primefact=0;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                primefact=primefact+sumOfDigit(i);
                n/=i;
            }
        }
        return primefact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(sumOfDigit(n)==BostonNumber(n)) {
            System.out.println((1));
        }
        else{
            System.out.println(0);
        }
    }
}

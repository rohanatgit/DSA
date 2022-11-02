package Lec4;

import java.util.Scanner;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem;
            n/=10;
        }
        System.out.println(s);
    }
}

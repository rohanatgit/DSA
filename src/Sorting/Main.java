package Sorting;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        while(n>0){
            if((n%10)%2==0){
                evensum+=n%10;
            }
            else{
                oddsum+=n%10;
                n/=10;
            }
        }
        System.out.print(evensum);
        System.out.print(oddsum);
    }
}
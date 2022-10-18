package Lec2;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int s=1;
        while(i<=n){
            int j=1;
            while(j<=s){
            System.out.print("*" +" ");
            j++;
          }
            s++;
            i++;
            System.out.println();
        }


    }
}

package Lec2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
         int row=1;
         int nst=n;//number of start in each row
         while(row<=n){
             //Start print
             int i=1;//count of star
             while(i<=nst){
                 System.out.print("*"+" ");
                 i++;
             }
             row++;
             //next row prep
             System.out.println();
         }
    }
}
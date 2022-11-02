package Lec4;

import java.util.Scanner;

public class Pascal_Traiangle {
    public static void main(String[] args) {
        int n=6;
        int row=0;
        int star=0;
        while(row<n){
            int i=0;
            int ncr=1;
            while(i<=star){
                System.out.print(ncr+" ");
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }

    }
}

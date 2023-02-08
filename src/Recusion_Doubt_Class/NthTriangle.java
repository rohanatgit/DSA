package Recusion_Doubt_Class;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

    }
    public static int countTriangle(int n){
        if(n==0){
            return 0;
        }
        int fn=countTriangle(n-1);
        return fn+n;
    }
}

package Lec13;

import java.util.Scanner;

public class Input_and_Display {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();//row
        int m=sc.nextInt();//col
        int[][] arr=new int[n][m];
        //Take input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //2d heap memory
        //aadress stack mai hota hai
        //print
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

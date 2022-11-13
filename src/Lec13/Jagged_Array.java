package Lec13;

import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][];
        //take input
        for(int i=0;i<arr.length;i++){
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Lec13;

import java.util.Scanner;

public class TransposeofaSquareMatrix {
    public static void traspose(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=row+1;col<arr.length;col++){
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][] =new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        traspose(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
    }
}

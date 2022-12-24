package DoubtClass;

import java.util.Scanner;

public class PiyushandMagicalPark {
    public static void maigicalPark(char[][] arr,int k,int s){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(s<k){
                    break;
                }
                if(arr[i][j]=='.'){
                    s=s-2;
                }
                if(arr[i][j]=='*'){
                  s=s+5;
                }
                if(arr[i][j]=='#'){
                   break;
                }
                if(j<arr[0].length-1){
                    s--;
                }
            }
        }
        if(s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();
        char[][] arr=new char[n][m];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        maigicalPark(arr,k,s);
    }

}

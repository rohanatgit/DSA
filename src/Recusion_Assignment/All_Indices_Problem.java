package Recusion_Assignment;

import java.util.Scanner;

public class All_Indices_Problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        find(arr,0,arr.length-1,tar);
    }
    public static void find(int arr[],int lb,int ub,int tar){
        if(lb>ub){
            return ;
        }
        if(arr[lb]==tar){
            System.out.println(lb+" ");
        }
        find(arr,lb+1,ub,tar);
    }
}

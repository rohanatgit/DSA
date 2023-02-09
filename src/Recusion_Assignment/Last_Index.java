package Recusion_Assignment;

import java.util.Scanner;

public class Last_Index {
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
        if(arr[ub]==tar){
            System.out.println(ub+" ");
            return ;
        }
        find(arr,lb+1,ub-1,tar);;
    }
}

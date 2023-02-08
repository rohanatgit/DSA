package Recusion_Doubt_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSet {
    static int c=0;
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     int target= sc.nextInt();
     printSubset(arr,0,"",0,target);
        System.out.println(c);
    }
    public static void printSubset(int[] arr,int i,String ans,int sum,int target){
        if(i==arr.length){
            if(sum==target) {
                System.out.println(ans);
                c++;
            }
            return ;
        }
        printSubset(arr,i+1,ans+arr[i]+" ",sum+arr[i],target);
        printSubset(arr,i+1,ans,sum+arr[i],target);
    }
}

package Recusion_Doubt_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSet {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     ArrayList<Integer>ll=new ArrayList<>();
     printSubset(arr,0,"");
    }
    public static void printSubset(int[] arr,int i,String ans){
        if(i==arr.length){
            System.out.println(ans);
            return ;
        }


        printSubset(arr,i+1,ans+arr[i]+" ");
        printSubset(arr,i+1,ans);
    }
}

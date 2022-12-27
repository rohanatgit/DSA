package DoubtClassString;

import java.util.Scanner;

public class Biggest_Number {
    public static int compare(int x1,int x2){
        String s1=""+x1+x2;//x1x2
        String s2=""+x2+x1;//x2x1
        if((Long.parseLong(s2) > Long.parseLong(s1))){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void sort(int[] arr){
        for(int trun=1;trun<arr.length;trun++){
            for(int i=0;i<arr.length-trun;i++){
                if(compare(arr[i],arr[i+1])>0){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
}

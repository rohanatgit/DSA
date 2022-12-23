package DoubtClass;

import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt();
            int[] brr=new int[n];
            for(int i=0;i<n;i++){
                int j=i-x;
                if(j<0){
                    j=j+n;
                }
                brr[i]=arr[i]+arr[j];
            }
            arr=brr;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum=sum%1000000007;
        System.out.println(sum);
    }
}

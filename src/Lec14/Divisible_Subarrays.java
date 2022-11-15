package Lec14;

import java.util.Scanner;

public class Divisible_Subarrays {
    public static long GoodSubArray(int[] arr,int n){
        long freq[]=new long[n];
        freq[0]=1;
        int sum=0;
        for (int i=0;i<freq.length;i++){
            sum=sum+arr[i];
            sum=sum%n;
            if(sum>0){
                sum+=n;
            }
            freq[sum]=freq[sum]+1;
        }
        long ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                ans=ans+(freq[i]*(freq[i]-1))/2;
            }
        }
        return ans;
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
            System.out.println(GoodSubArray(arr,n));
        }
    }
}

package DoubtClass;

import java.util.Scanner;

public class MaximumCircularSum {
    public static int maxmimumSum(int arr[]){
        int linearKadan=kadans(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=arr[i]*-1;
        }
        int Inverted_kadane=kadans(arr);
        int cirl_kadane=Inverted_kadane+sum;
        return Math.max(linearKadan,cirl_kadane);
    }
    public static int kadans(int arr[]){
        int ans=Integer.MIN_VALUE;
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum+=arr[i];
            ans=Math.max(ans,presum);
            if(presum<0){
                presum=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

        }
    }
}

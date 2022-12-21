package DoubtClass;

import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static int maximumsum(int[] arr){
        int linear_kadene=kadane(arr);
        int sum=0;
         for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
             arr[i]=arr[i]*-1;
         }
         int Inverted=kadane(arr);//12
         int cirl_kadane=Inverted+sum;
         return Math.max(linear_kadene,cirl_kadane);
    }
    public static int kadane(int[] arr){
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
        while(t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maximumsum(arr));
        }
    }
}

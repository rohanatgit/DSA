package DoubtClass;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static int Rainwater(int [] arr){
        int n=arr.length-1;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i],arr[i+1]);
        }
        int ans=0;
        for(int i=0;i<right.length;i++){
            int min=Math.min(left[i],right[i]);
            ans=ans+(min-arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Rainwater(arr));
    }
}

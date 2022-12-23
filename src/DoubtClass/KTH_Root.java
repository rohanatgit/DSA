package DoubtClass;

import java.util.Scanner;

public class KTH_Root {
    public static long KthRoot(long n ,int k){
        long lo=1;
        long hi=n;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int k=sc.nextInt();
            System.out.println(KthRoot(n,k));
        }
    }

}

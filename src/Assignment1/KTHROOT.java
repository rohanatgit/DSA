package Assignment1;

import java.util.Scanner;

public class KTHROOT {
    public static long kthroot(long n,long k){
        long lo = 1;
        long hi = n;
        long ans = 0;
        while (lo <= hi) {
            long mid = (lo - hi) / 2+hi;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     long t=sc.nextLong();
     while(t-->0) {
         long n = sc.nextLong();
         long k = sc.nextLong();
         System.out.println(kthroot(n,k));

     }

    }
}

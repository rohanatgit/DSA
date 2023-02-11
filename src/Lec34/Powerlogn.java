package Lec34;

import java.security.spec.RSAOtherPrimeInfo;

public class Powerlogn {
    public static void main(String[] args) {
        int ans=powerlogN(2,3);
        System.out.println(ans );
    }
    public static int powerlogN(int a,int n)
    {
        if(n==0){
            return 1;
        }
        int ans=powerlogN(a,n/2);
        ans=ans*ans;// a^n
        if(n%2!=0)
        {
            ans=ans*a;
        }
        return ans;
    }
}

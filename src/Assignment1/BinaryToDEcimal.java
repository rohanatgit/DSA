package Assignment1;


import java.util.*;
public class BinaryToDEcimal {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        int ans=0;
        int   pos=0;
        while(n>0){
            long rem=n%10;
            ans=(int)(ans+rem*(Math.pow(2,pos)));
            pos++;
            n/=10;
        }
        System.out.print(ans);
    }
}
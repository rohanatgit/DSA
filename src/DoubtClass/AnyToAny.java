package DoubtClass;

import java.util.Scanner;

public class AnyToAny {
    public static int base10(int num,int src){
        int ans=0;
        int mul=1;
        while(num!=0){
            int rem=num%10;
            ans=ans+rem*mul;
            mul*=src;
            num/=10;
        }
        return ans;
    }
    public static int disbase(int num,int dis){
        int ans=0;
        int mul=1;
        while(num!=0){
            int rem=num%10;
            ans=ans+rem*mul;
            mul*=dis;
            num/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int src=sc.nextInt();
        int db=sc.nextInt();
        int num=sc.nextInt();
       int num1=base10(num,src);
        System.out.println(disbase(num1,db));
    }
}

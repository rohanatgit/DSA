package DoubtClassString;

import java.util.Scanner;

public class ASCII_Diffrence {
    public static void Ascii(String str){//acb
        String ans="";
        char prev=str.charAt(0);
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            ans=ans+prev+(curr-prev);//c-a =99-97
            prev=curr;
        }
        ans=ans+prev;
        System.out.println(ans);
    }
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     String str=sc.next();
        Ascii(str);
    }
}

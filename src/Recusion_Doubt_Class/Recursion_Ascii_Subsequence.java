
package Recusion_Doubt_Class;

import java.util.Scanner;

public class Recursion_Ascii_Subsequence {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          int t=sc.nextInt();
          while(t-->0){
              String str=sc.next();
          }
    }
    public static int printSubSeqnce(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }

        char ch=ques.charAt(0);
        int f1=printSubSeqnce(ques.substring(1),ans);
        int f2=printSubSeqnce(ques.substring(1),ans+ch);
        int f3=printSubSeqnce(ques.substring(1),ans+(int)ch);
        return f1+f2+f3;
    }
}

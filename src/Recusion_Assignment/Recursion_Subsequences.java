package Recusion_Assignment;

import java.util.Scanner;

public class Recursion_Subsequences {
    static int count=0;
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      String str=sc.next();
      subsequence(str,"");
        System.out.println(count);
    }
    public static void subsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return ;
        }
        char ch=ques.charAt(0);
        subsequence(ques.substring(1),ans);
        subsequence(ques.substring(1),ans+ch);
    }
}

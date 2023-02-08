package Recusion_Doubt_Class;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            binaryString(str,"");
            System.out.println();
        }
    }
    public static void binaryString(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        if(ch=='?'){
            binaryString(ques.substring(1),ans+'0');
            binaryString(ques.substring(1),ans+'1');;
        }
        else{
            binaryString(ques,ans+ch);
        }

    }
}

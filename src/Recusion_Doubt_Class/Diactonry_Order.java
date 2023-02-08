package Recusion_Doubt_Class;

import java.util.Scanner;

public class Diactonry_Order {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        printpermutation(str,"",str);
    }
    public static void printpermutation(String ques,String ans ,String org){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }

        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String ros=ques.substring(0,i)+ques.substring(i+1);
            printpermutation(ros,ans+ch,org);
        }
    }
}

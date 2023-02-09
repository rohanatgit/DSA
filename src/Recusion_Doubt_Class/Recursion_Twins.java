package Recusion_Doubt_Class;

import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        System.out.println(TwinsCount(str));

    }
    public static int TwinsCount(String ques){
        if (ques.length() < 3) {
            return 0;
        }
        int c=0;
        if(ques.charAt(0)==ques.charAt(2)){
            c++;
        }
        c=c+TwinsCount(ques.substring(1));
        return c;
    }
}

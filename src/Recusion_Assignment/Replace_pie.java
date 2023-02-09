package Recusion_Assignment;

import java.util.Scanner;

public class Replace_pie {
    public static String replace(String str){
        if(str.length()==0 || str.length()==1){
            return str;
        }
        String sa=replace(str.substring(1));
        if(str.charAt(0)=='p' && sa.charAt(0)=='i'){
            return 3.14+sa.substring(1);
        }
        return str.charAt(0)+sa;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            System.out.println(replace(str));
        }
    }
}

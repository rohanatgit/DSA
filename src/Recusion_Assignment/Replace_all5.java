package Recusion_Assignment;

import java.util.Scanner;

public class Replace_all5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String nn=n+"";
        System.out.println(Replace5(nn));
    }
    public static String Replace5(String n){
        if(n.length()==0){
            return n;
        }
        String sa=Replace5(n.substring(1));
        if(n.charAt(0)==5){
            return "5"+sa;
        }
        return n.charAt(0)+sa;
    }
}

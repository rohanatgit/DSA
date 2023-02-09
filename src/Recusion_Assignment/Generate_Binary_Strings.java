package Recusion_Assignment;

import java.util.Scanner;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();

        }
    }
    public static void binaryString(String str ,String ans ){
        if(str.length()==0){
            System.out.println(ans+"");
            return;
        }
        if(str.charAt(0)=='?'){
            binaryString(str.substring(1),ans+0);
            binaryString(str.substring(1),ans+1);
        }
        else{
            binaryString(str.substring(1),ans+str.charAt(0));
        }
    }
}

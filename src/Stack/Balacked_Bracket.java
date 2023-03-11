package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balacked_Bracket {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String str=sc.nextLine();
       Stack<Character> st=new Stack<>();
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='(' || ch=='{' || ch=='['){

           }
           else if(ch==')'){

           }
           else if(ch=='}'){

           }
           else if(ch==']'){

           }
       }

    }
}

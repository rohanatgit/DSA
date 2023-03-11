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
               st.push(ch);
           }
           else if(ch==')'){
                  if(st.size()==0){
                      System.out.println(false);
                      return ;
                  }
                  else if(st.peek()!='('){
                      System.out.println(false);
                      return ;
                  }
                  else {
                      st.pop();
                  }
           }
           else if(ch=='}'){
               if(st.size()==0){
                   System.out.println(false);
                   return ;
               }
               else if(st.peek()!='{'){
                   System.out.println(false);
                   return ;
               }
               else {
                   st.pop();
               }
           }
           else if(ch==']'){
               if(st.size()==0){
                   System.out.println(false);
                   return ;
               }
               else if(st.peek()!='['){
                   System.out.println(false);
                   return ;
               }
               else {
                   st.pop();
               }

           }
           System.out.println(true);
       }

    }
}

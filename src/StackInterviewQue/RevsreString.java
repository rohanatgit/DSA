package StackInterviewQue;

import java.util.Stack;

public class RevsreString {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        String s="java";
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
       for(int i=0;i<s.length();i++){
           ch[i]=st.pop();
       }
        System.out.println(String.valueOf(ch));
    }
}

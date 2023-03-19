package StackInterviewQue;

import java.util.Stack;

public class RevsreString {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        String s="java";
        for (int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            st.pop();
        }
    }
}

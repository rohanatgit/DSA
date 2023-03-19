package StackInterviewQue;

import java.util.*;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static String remove(String str){
        Stack<Character> st =new Stack<>();
        StringBuilder sbb =new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i)){
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
        }
        for(Character ch :st){
            sbb.append(ch);
        }
        return sbb.toString();
    }

    public static void main(String[] args) {
        String str="abbaca";
        String ans=remove(str);
        System.out.println(ans);
    }
}

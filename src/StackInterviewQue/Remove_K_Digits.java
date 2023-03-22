package StackInterviewQue;

//import Lec30.StringBuilder;

import java.util.*;

public class Remove_K_Digits {
    public static String kdigit(String num,int k){
        if(k==0){
            return num;
        }
        if(k==num.length()){
            return "0";
        }
        Stack <Character>st =new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch =num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        for(int i=0;i<k;i++){
            st.pop();
        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(kdigit("10200",1));
    }
}

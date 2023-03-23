package StackAssignment;

import Lec30.StringBuilder;

import java.util.Scanner;
import java.util.Stack;

public class RevsreStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        char[]  ch =str.toCharArray();
        for(int i=0;i<str.length();i++) {
            st.push(str.charAt(i));
        }
      for(int i=0;i<str.length();i++){
          ch[i]=st.pop();
      }
        System.out.println( String.valueOf(ch));

    }
}

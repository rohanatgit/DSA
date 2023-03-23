package StackAssignment;

import Lec30.StringBuilder;

import java.util.Scanner;
import java.util.Stack;

public class RevsreStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder sb =new StringBuilder();
        while(!st.isEmpty()){

        }

    }
}

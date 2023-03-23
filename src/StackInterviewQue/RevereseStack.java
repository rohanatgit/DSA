package StackInterviewQue;

import java.util.Stack;

public class RevereseStack {
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int temp=st.pop();
        reverse(st);
        insertAtlast(st,temp);
    }
    public static void insertAtlast(Stack<Integer> st ,int ele){
        if(!st.isEmpty()){
            st.push(ele);
            return ;
        }
       int te=st.pop();

    }
}

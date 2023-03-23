package StackInterviewQue;

import java.util.Stack;

public class SortStack {
    public static void push(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int temp=st.pop();
        insertCorrectPos(st,temp);
    }
    public static void insertCorrectPos(Stack<Integer> st ,int temp){
        if(st.isEmpty() || st.peek()<temp){
            st.push(temp);
            return ;
        }

    }
}

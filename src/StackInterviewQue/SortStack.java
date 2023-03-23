package StackInterviewQue;

import java.util.Stack;

public class SortStack {
    public static void push(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int temp=st.pop();
        push(st);
        insertCorrectPos(st,temp);
    }
    public static void insertCorrectPos(Stack<Integer> st ,int temp){
        if(st.isEmpty() || st.peek()<temp){
            st.push(temp);
            return ;
        }
      int ele=st.pop();
        insertCorrectPos(st,temp);
        st.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(10);
        st.push(1);
        st.push(30);
        st.push(20);
        System.out.println(st);
        push(st);
        System.out.println(st);
    }
}

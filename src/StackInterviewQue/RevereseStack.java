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
        if(st.isEmpty()){
            st.push(ele);
            return ;
        }
       int te=st.pop();
        insertAtlast(st,ele);
        st.push(te);
    }

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}

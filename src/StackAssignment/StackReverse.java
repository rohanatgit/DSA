package StackAssignment;

import java.util.Stack;

public  class  StackReverse {
    public static void reverse(Stack<Integer> st ){
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
        int top=st.pop();
        insertAtlast(st,ele);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(8);
        st.push(6);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}

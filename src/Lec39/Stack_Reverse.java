package Lec39;

import java.util.Stack;

public class Stack_Reverse {
    public static void main(String[] args) {

    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int x=st.pop();
        reverse(st);
        st.push(x);

    }
}

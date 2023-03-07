package Lec39;

import java.util.Stack;

public class Stack_Reverse {
    public static void main(String[] args) {
       Stack <Integer> st=new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
        System.out.println(st);
        System.out.println("**************");
        reverse(st);
        System.out.println(st);


    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int x=st.pop();
        reverse(st);
        st.push(x);
    }
    public static void Insert_Down(Stack<Integer> st,int x){

    }
}

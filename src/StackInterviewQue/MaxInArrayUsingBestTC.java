package StackInterviewQue;

import java.util.Stack;

public class MaxInArrayUsingBestTC {
    Stack<Integer> st =new Stack<>();
    Stack<Integer>maxSt=new Stack<>();
    public void push(int data){
        int max=data;
        if(!maxSt.isEmpty() && maxSt.peek()<max){
            max=maxSt.peek();
        }
        st.push(data);
        maxSt.push(max);
    }
    public void pop(){
        st.pop();
        maxSt.pop();
    }
    public int getMax(){
        return maxSt.peek();
    }

    public static void main(String[] args) {
        MaxInArrayUsingBestTC maxEle=new MaxInArrayUsingBestTC();
        maxEle.push(4);
        maxEle.push(3);
        maxEle.push(9);
        maxEle.push(2);
        maxEle.push(8);
        System.out.println(maxEle.st);
        System.out.println(maxEle.maxSt);
        System.out.println("Max Elem "+maxEle.getMax());
        maxEle.pop();
        maxEle.pop();
        maxEle.pop();
        System.out.println(maxEle.st);
        System.out.println(maxEle.maxSt);
        System.out.println("Max Ele "+maxEle.getMax());
    }
}

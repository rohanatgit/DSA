package Lec37Stack;

public class Stack {
    //pointer
    private int [] data;
    private int top=0;
    public Stack(){
        this.data=new int[5];
    }
    public Stack(int cap){
        this.data=new int[cap];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public void push(int item){
        this.data[this.top]=item;
        this.top++;
    }
    public boolean isFull(){
        return this.top==this.data.length;
    }
    public int pop(){
        this.top--;
        return this.data[top];
    }
    public int peek(){
        return this.data[top-1];
    }
}

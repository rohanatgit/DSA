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
    public void push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Sun be pgl hai kya stack full ho gya ");
        }
        this.data[this.top]=item;
        this.top++;
    }
    public boolean isFull(){
        return this.top==this.data.length;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("pgl hai, stack empty hai ");
        }
        this.top--;
        return this.data[top];
    }
    public int peek() throws Exception { //top element return
        if(isEmpty()){
            throw new Exception("pgl hai, stack empty hai ");
        }
        return this.data[top-1];
    }
    public int size(){
        return this.top;
    }
    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(this.data[i]+" ");
        }
        System.out.println();
    }

}

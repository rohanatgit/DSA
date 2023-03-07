package Lec39;

import Lec38.Dynamic_Queue;
import Lec38.Dynamic_Stack;

public class Queue_Using_Stack {
    private Dynamic_Stack data;
    public  Queue_Using_Stack(){
        this.data=new Dynamic_Stack();
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    public int size(){
        return this.data.size();
    }
    public void Enqueue(int x) throws Exception {
        this.data.push(x);
    }
    public int dequeue() throws Exception {
        Dynamic_Stack temp=new Dynamic_Stack();
        while(this.data.size()!=1){
            temp.push(this.data.pop());
        }
        int x=this.data.pop();
        while(temp.size()!=1){
            this.data.push(temp.pop());
        }
        return x;
    }
    public int getfront() throws Exception {
        Dynamic_Stack temp=new Dynamic_Stack();
        while(this.data.size()!=0){
            temp.push(this.data.pop());
        }
        int x=this.data.peek();
        while(temp.size()!=1){
            this.data.push(temp.pop());
        }
        return x;
    }
}

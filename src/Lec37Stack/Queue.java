package Lec37Stack;

public class Queue {
    private int[] data;
    private int front = 0;
    private int size = 0;

    public Queue() {
        this.data = new int[5];
    }

    public Queue(int cap) {
        this.data = new int[cap];
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public boolean isFull(){
        return this.size==this.data.length;
    }

    public int size(){
        return this.size;
    }

    public void Enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("sun pgl hai kya enqueue full ho gya hai bhai");
        }
          this.data[this.size]=item;
          this.size++;
    }
     public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("sun empty hai");
        }
        int rv=this.data[this.front];
        this.front=this.front+1;
        this.size--;
        return rv;
     }
     public int getFront(){
        return this.data[this.front];
     }


}

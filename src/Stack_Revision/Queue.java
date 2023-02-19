package Stack_Revision;

public class Queue {
    private int data[];
    private int front;
    private int size=0;
    public Queue(){
        this.data=new int[5];
    }
    public Queue(int cap){
        this.data=new int[cap];
    }
    public int getFornt() throws Exception {
        if(isEmpty()){
            throw new Exception("pgl");
        }
        return this.data[this.front];
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.data.length;
    }
    public void enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("pgl");
        }
        int i=(this.size+this.front)%this.data.length;
        this.data[i]=item;
        this.size++;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("pgl");
        }
        int rv=this.data[this.front];
        this.front=(this.front+1)%data.length;
        size--;
        return rv;
    }
    public void Display(){
        for(int i=0;i<size;i++){
            int idx=(this.front+i)%this.data.length;
            System.out.println(this.data[idx]+" ");
        }
        System.out.println();
    }
}

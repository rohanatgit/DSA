package Stack_Revision;

public class Stack {
    private int[] data;
    private int top;
    public Stack(){
        this.data=new int[5];
    }
    public Stack(int cap){
        this.data=new int[cap];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return this.top==this.data.length;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("pgl");
        }
        this.data[top]=item;
        this.top++;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("pgk");
        }
        return this.data[top-1];
    }
    public int size(){
        return this.top;
    }
    public void display()
    {
        for(int i=0;i<top;i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("pdh");
        }
        this.top--;
        return this.data[top];
    }
}

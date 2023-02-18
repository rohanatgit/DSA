package Lec37Stack;

public class Queue {
    private int[] data;
    private int front=0;
    private int size=0;

    public Queue(){
        this.data=new int[5];
    }
    public Queue(int cap){
        this.data=new int[cap];
    }

}

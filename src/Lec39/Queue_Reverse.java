package Lec39;

import Lec38.Dynamic_Queue;

public class Queue_Reverse {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq=new Dynamic_Queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        System.out.println(dq);
        System.out.println("%%%%%%%%%%%%%%%%%%");
        reverse(dq);
    }
    public static void reverse(Dynamic_Queue dq) throws Exception {
        if(dq.isEmpty()){
            return ;
        }
        int x=dq.dequeue();
        reverse(dq);
        dq.Enqueue(x);
    }
}

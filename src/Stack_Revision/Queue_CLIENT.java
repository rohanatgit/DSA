package Stack_Revision;

import Lec37Stack.Queue;

public class Queue_CLIENT {
        public static void main(String[] args) throws Exception {
            Lec37Stack.Queue qq=new Queue();
            qq.Enqueue(10);
            qq.Enqueue(20);
            qq.Enqueue(30);
            qq.Enqueue(40);
            qq.Enqueue(50);
            qq.dequeue();//10
            qq.dequeue();//20
            qq.Display();
            qq.Enqueue(50);
            qq.Enqueue(60);
            qq.Enqueue(70);
            qq.Display();
        }
}
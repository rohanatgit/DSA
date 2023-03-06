package Lec38;
import Lec37Stack.Queue;
public class Dynamic_Queue extends Queue{
    public void Enqueue(int item) throws Exception {
        if(super.isFull()){
             int arr[]=new int[2*super.data.length];
             for(int i=0;i<super.data.length;i++){
                 int idx=(this.front+1)%this.data.length;
                 arr[i]=data[idx];
             }
             this.data=arr;
             this.front=0;
        }
        super.
                Enqueue(item);
    }
}

package Lec38;

//import Stack_Revision.Stack;
import Lec37Stack.Stack;

public class Dynamic_Stack extends Stack {
    public void push(int item) throws Exception {
        if (this.isFull()) {
            int[] arr = new int[2 * this.data.length];
            for (int i = 0; i < data.length; i++) {
                arr[i] = this.data[i];
            }
            this.data=arr;
        }
        super.push(item);
    }
}
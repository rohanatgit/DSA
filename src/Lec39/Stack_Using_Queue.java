package Lec39;

import Lec38.Dynamic_Queue;

public class Stack_Using_Queue {
    private Dynamic_Queue data;

    public Stack_Using_Queue() {
        this.data = new Dynamic_Queue();
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public int size() {
        return this.data.size();
    }

    public void push(int item) throws Exception {
        Dynamic_Queue temp = new Dynamic_Queue();
        while (!this.data.isEmpty()) {
            temp.Enqueue(data.dequeue());
        }
        this.data.Enqueue(item);
        while (!this.isEmpty()) {
            data.Enqueue(temp.dequeue());
        }
    }

    public int pop() throws Exception {
        return this.data.dequeue();
    }

    public int peek() {
        return this.data.getFront();
    }
}
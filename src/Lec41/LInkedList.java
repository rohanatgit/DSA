package Lec41;

public class LInkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;// Phle Node ka address btayega
    private int size;//Linked List m kitne node hai
    private Node tail;//Linked List ka last ka node
    public void addfirst(int item){
        Node nn =new Node(item);
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
    else {
           nn.next=this.head;
           this.head=nn;
           this.size++;
        }
    }
}

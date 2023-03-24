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
           nn.next=this.head;//(taar ) jod deye hai (connection )
           this.head=nn;
           this.size++;
        }
    }
    public void display(){
                              // tail ka next mai null hota hai
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(".");
    }
}

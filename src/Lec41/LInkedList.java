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
    public void addlast(int item){
        if(this.size==0){
            addfirst(item);
        }
        else{
            Node nn =new Node(item);
            this.tail.next=nn;
            this.tail=nn;
            this.size++;
        }
    }
    public void addatindex(int item,int k){

    }
    //get
    public int getfirst() throws Exception {
       if(this.head==null){
           throw new Exception("pgl LINKEDLIST Khali hai nikal yha se ");
       }
        return head.data;//head mai null hai toh null POINTER expception aayega
    }
    //getlast
    public int getlast() throws Exception {
        if(this.head==null){
            throw new Exception("pgl hai kya yaar tu ");
        }
        return this.tail.data;
    }
    public int getAtindex(int k) throws Exception {
        return getnode(k).data;
    }
    private Node getnode(int k) throws Exception {
       if(k<0 || k>=size){
           throw new Exception("Index out of bound");
       }
       Node temp=this.head;
       for(int i=0;i<k;i++){
           temp=temp.next;
       }
       return temp;
    }
    public int removeFirst(){
        Node temp=this.head;
        this.head=this.head.next;
        temp.next=null;
        this.size--;
        return temp.data;
    }
    public void display(){
                              // tail ka next mai null hota hai
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(".");
    }
}

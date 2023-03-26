package Lec42;

public class Linked_List_Cycle {
      public class Node{
          int data;
          Node next;
          public Node(int data){
              this.data=data;
          }
      }
      private Node head;
      private int size;
      private Node tail;
      public void addfirst(int item){
          Node nn =new Node(item);
          if(this.size==0){
              this.head=nn;
              this.tail=nn;
              this.size++;
          }
          else{
              nn.next=head.next;
              this.head=nn;
              this.size++;
          }
      }
      public void addlast(int item){
          if(this.size==0){
              addfirst(item);
          }
          Node nn =new Node(item);
          this.tail.next=nn;
          this.tail=nn;
          size++;
      }
   public void CreateCycle(){
          this.tail.next =this.head;//circular

   }

}

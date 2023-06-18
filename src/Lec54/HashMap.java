package Lec54;

import java.util.ArrayList;

public class HashMap <K,V>{
    public class Node{
        K key;
        V value;
        Node next;
        public Node(){

        }
     public Node(K key, V value){
            this.key=key;
            this.value=value;
        }
    }
    private ArrayList<Node>bucketarray;
    private int size=0;

    public HashMap(int x){
       this.bucketarray=new ArrayList<>();
       for(int i=0;i<x;i++){
           this.bucketarray.add(null);
       }
    }
    public HashMap(){
        this(4);
    }
    public void put(K key,V value){
        int bn=hashfunction(key);
        Node temp=this.bucketarray.get(bn);//1st Address
        while(temp!=null){
            if(temp.key.equals(key)) {
                temp.value=value;
                return;
            }
            temp=temp.next;
        }
        Node nn =new Node (key,value);
        temp=this.bucketarray.get(bn);
        nn.next=temp;
        this.bucketarray.set(bn,nn);
        this.size++;
    }
   public int hashfunction(K key){
      int bn=key.hashCode() % this.bucketarray.size();

      if(bn<0){
          bn+=this.bucketarray.size();
      }
      return bn;
   }
}

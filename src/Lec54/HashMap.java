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
   public int hashfunction(K key){

   }
}

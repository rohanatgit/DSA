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
        double If=(1.0*this.size)/this.bucketarray.size();
        double thf=2.0;
        if(If>thf){
            reshaing();
        }
    }

    private void reshaing() {
        ArrayList<Node>nba=new ArrayList<>();
        for(int i=0;i<this.bucketarray.size();i++){
            nba.add(null);
        }
    }

    public V get(K key){
        int bn=hashfunction(key);
        Node temp=this.bucketarray.get(bn);
        while(temp!=null){
            if(temp.key.equals(key)) {
                return temp.value;
            }
            temp=temp.next;
        }
          return null;
    }


    public boolean containsKey(K key){
        int bn=hashfunction(key);
        Node temp=this.bucketarray.get(bn);
        while(temp!=null){
            if(temp.key.equals(key)) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public V remove(K key){
        int bn=hashfunction(key);
        Node curr=this.bucketarray.get(bn);
        Node prev=null;
        while(curr!=null){
            if(curr.key.equals(key)) {
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            return null;
        }
        this.size--;
        if(prev==null)
        {
            this.bucketarray.set(0,curr.next);
            curr.next=null;
        }
        else{
            prev.next=curr.next;
            curr.next=null;
        }
        return curr.value;

    }
   public int hashfunction(K key){
      int bn=key.hashCode() % this.bucketarray.size();

      if(bn<0){
          bn+=this.bucketarray.size();
      }
      return bn;
   }
   @Override
    public String toString(){
        String s="{";
       for(Node node:bucketarray){
           while(node!=null){
               s=s+node.key+"="+node.value+", ";
               node=node.next;
           }
       }
          s=s+"}";
        return s;
   }
}
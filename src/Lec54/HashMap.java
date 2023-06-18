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
    public HashMap(){

    }

}

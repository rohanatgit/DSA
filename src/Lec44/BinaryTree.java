package Lec44;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc =new Scanner(System.in);
      public class Node{
          int data;
          Node left;
          Node right;
      }
      public Node root;
      public BinaryTree(){
          this.root=CreateTree();
      }
      private Node CreateTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hasleftchild=sc.nextBoolean();
        if(hasleftchild==true){
               nn.left=CreateTree();
        }
        boolean hasrightchild=sc.nextBoolean();
        if(hasrightchild==true){
            nn.right=CreateTree();
        }
        return nn;
      }
}

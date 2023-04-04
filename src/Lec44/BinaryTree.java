package Lec44;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc =new Scanner(System.in);
      public class Node{
          int data;
          Node left;
          Node right;
      }
      private Node root;
      public BinaryTree(){
          this.root=CreateTree();
      }
      private Node CreateTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hasleftchild=sc.nextBoolean();
        if(hasleftchild==true){
               nn.left=CreateTree();//left subtree
        }
        boolean hasrightchild=sc.nextBoolean();
        if(hasrightchild==true){
            nn.right=CreateTree();//right subtree
        }
        return nn;
      }
      public void Display(Node nn){
          String str="";
          str=str+nn.data;
          str="<---"+str+"--->";
          if(nn.left!=null){
              str=nn.left.data+str;
          }
          else{
              str="."+str;
          }

      }
}

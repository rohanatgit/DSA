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
      public void Display(){
          Display(this.root);
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
          if(nn.right!=null){
              str=str+nn.right.data;
          }
          else{
              str=str+".";
          }
          System.out.println(str);
          Display(nn.left);//left subtree visite
          Display(nn.right);//right subtree visite
      }
      public int max(){
         return  max(this.root);
      }
      private int max(Node node){
          if(node ==null){
              return Integer.MIN_VALUE;
          }
          int lmax=max(node .left);
          int rmax=max(node.right);
          return Math.max(lmax,Math.max(rmax,node.data));
      }
}
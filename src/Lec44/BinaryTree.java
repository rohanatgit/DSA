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
      public boolean find(int item){
          return find(this.root,item);
      }
      private boolean find(Node nn,int item){
          if(nn==null){
              return false;
          }
        if(nn.data==item)
        {
            return true;
        }
        return find(nn.left,item) || find(nn.right,item);

      }
      public int ht(){
          //maximum diff between root to leaf
          //single node size hmm 0 manege
          return ht(this.root);
      }
      private int ht(Node node){
     if(node==null){
         return -1;
     }
          int lh=ht(node.left);
          int rh=ht(node.right);
          return Math.max(lh,rh)+1;
      }
}
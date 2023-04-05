package Lec45;

import Lec44.BinaryTree;

import java.util.Scanner;

public class Travesal {
    Scanner sc =new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
     public Travesal(){
         this.root=createTree();
     }
     private Node createTree(){
         int item=sc.nextInt();
         Node nn =new Node();
         nn.data=item;
         boolean hlc=sc.nextBoolean();
         if(hlc==true){
             nn.left=createTree();
         }
         boolean hrc=sc.nextBoolean();
         if(hrc==true){
             nn.right=createTree();
         }
         return nn;
     }
     public void PreOrder(){
         PreOrder(this.root);
         System.out.println();
     }
     private void PreOrder(Node node){
         if(node ==null){
             return ;
         }
         System.out.println(node.data+" ");
         PreOrder(node.left);
         PreOrder(node.right);
     }
     public void postOrder(){
         postorder(this.root);
         return ;
     }
     private void postorder(Node node){
         if(node ==null){
             return ;
         }
         postorder(node.left);
         postorder(node.right);
         System.out.println(node.data+" ");
     }
   public void Inorder(){
         inorder(this.root);
         return ;
   }
   private void inorder(Node node){
         if(node==null){
           return ;
       }
         inorder(node.left);
       System.out.println(node.data+" ");
         inorder(node.right);

   }
    public static void main(String[] args) {
        Travesal tt =new Travesal();
        tt.postOrder();
        tt.PreOrder();
    }
}

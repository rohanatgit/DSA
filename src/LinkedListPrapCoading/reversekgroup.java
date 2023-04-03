package LinkedListPrapCoading;

import java.util.Scanner;

public class reversekgroup {
       public static class ListNode{
           int val=0;
           ListNode next=null;
           ListNode (int val){
               this.val=val;
           }
       }
       public static void printList(ListNode node){
           while(node !=null){
               System.out.println(node.val+" ");
               node =node .next;
           }
       }
       public static ListNode createList(int n){
           Scanner sc =new Scanner(System.in);

           ListNode dummy=new ListNode (-1);
           ListNode prev=dummy;
           while(n-->0){
               prev.next=new ListNode(sc.nextInt());
               prev=prev.next;
           }
           return prev;
       }
}

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
      static  ListNode th=null;
       static  ListNode tt=null;
       public static void addFirstNode(ListNode node){
           if(th==null){
               th=node;
               tt=node;
           }
           else{
               node .next=th;
               th=node;
           }
       }

       public static int length(ListNode node){
           ListNode curr=node;
           int len=0;
           while(curr!=null){
               curr=curr.next;
               len++;
           }
           return len;
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

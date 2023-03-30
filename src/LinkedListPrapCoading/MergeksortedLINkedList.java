package LinkedListPrapCoading;

import java.util.Scanner;

public class MergeksortedLINkedList {
   public static class ListNode {
       int val = 0;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }

   }
   public static  ListNode mergetwoSortedLinkedList(ListNode l1,ListNode l2){
//       ListNode temp=new ListNode(-1);
       ListNode dummy=new ListNode (-1);
       ListNode temp=dummy;
       while(l1!=null && l2!=null){
           if(l1.val<l2.val){
               temp.next=l1;
               temp=temp.next;
               l1=l1.next;
           }
           else{
               temp.next=l2;
               temp=temp.next;
               l2=l2.next;
           }
       }
       if(l1==null){
           temp.next=l2;
           temp=temp.next;
       }
       if(l2==null){
           temp.next=l1;
           temp=temp.next;
       }
       return dummy.next;
   }
public static void printList(ListNode node){
       while(node!=null){
           System.out.println(node.val+" ");
           node =node.next;
       }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ListNode dummy=new ListNode (-1);
        ListNode prev=dummy;
        while(n-->0){
            prev.next=new ListNode (sc.nextInt());
            prev=prev.next;
        }
    }
}

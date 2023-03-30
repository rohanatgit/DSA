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

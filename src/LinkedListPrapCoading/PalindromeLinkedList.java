package LinkedListPrapCoading;

import java.util.Scanner;

public class PalindromeLinkedList {
    public static class ListNode{
        int val=0;
        ListNode next=null;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode midNode(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode forwd=null;
        while(curr!=null){
            forwd =curr.next;//backup
            prev=curr.next;
            prev=curr;
            curr=forwd;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ListNode dummy =new ListNode(-1);
        ListNode prev=dummy;
        while(n-->0){
            prev.next=new ListNode (sc.nextInt());
            prev=prev.next;
        }
        System.out.println(ispalidrome(dumm.next));
    }
}

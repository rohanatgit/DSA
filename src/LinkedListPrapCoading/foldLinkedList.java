package LinkedListPrapCoading;

import java.util.Scanner;

public class foldLinkedList {
    public static class ListNode{
        int val=0;
        ListNode next=null;
        ListNode(int val){
            this.val=val;
        }
    }
public static ListNode midNode(ListNode head) {
    if (head == null || head.next == null)
    {
        return head;
    }
    ListNode slow=head;
    ListNode fast=head;
    while(fast==null &&  fast.next==null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
}
public static ListNode reverseLL(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
     ListNode prev=null;
        ListNode curr=head;
        ListNode ford=null;
        while(curr!=null){
            ford=curr.next;//backup
            curr.next=prev;
            prev=curr;
            curr=ford;
        }
        return prev;
}

    static void printlist(ListNode node){
        while(node!=null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        while(n-->0){
           prev.next=new ListNode(sc.nextInt());
           prev=prev.next;
        }
    }
}

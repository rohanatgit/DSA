package LinkedListPrapCoading;

import java.util.Scanner;

public class ReverseLinkedList {
    public static class ListNode{
        int val=0;
        ListNode next=null;
        ListNode (int val){
            this.val=val;
        }
    }
    public static ListNode revese(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode forw=null;
        while(curr!=null){
            forw=curr.next;//backup
            curr.next=prev;//link
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ListNode dummy =new ListNode (-1);
        ListNode prev=dummy;
        while(n-->0){
            prev.next=new ListNode (sc.nextInt());
            prev=prev.next;
        }
        ListNode head =revese(dummy.next);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}

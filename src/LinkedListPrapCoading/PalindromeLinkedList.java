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
            curr.next=prev;//link
            prev=curr;
            curr=forwd;
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=midNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        nhead=reverse(nhead);
        ListNode c1=head;
        ListNode c2=nhead;
        boolean result=true;
        while(c1!=null && c2!=null){
            if(c1.val!=c2.val){
                result=false;
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        nhead=reverse(nhead);
        mid.next=nhead;
        return result;
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
        System.out.println(isPalindrome(dummy.next));
    }
}

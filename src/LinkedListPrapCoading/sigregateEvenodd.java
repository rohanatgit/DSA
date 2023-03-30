package LinkedListPrapCoading;

import java.util.Scanner;

public class sigregateEvenodd {
    public static class ListNode{
        int val=0;
        ListNode next=null;
        ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode segregateEvenodd(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummyEven=new ListNode(-1);
        ListNode dummyodd=new ListNode(-1);
        ListNode eventail=dummyEven;
        ListNode oddtail=dummyodd;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val%2!=0){//odd
                oddtail.next=curr;
                oddtail=oddtail.next;
            }
            else{
                eventail.next=curr;
                eventail=eventail.next;
            }
            curr=curr.next;
        }
        eventail.next=dummyodd.next;
        oddtail.next=null;
        return dummyEven.next;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        while(n-->0){
            prev.next=new ListNode (sc.nextInt());
            prev=prev.next;
        }
        ListNode head=segregateEvenodd(dummy.next);
        while(head!=null){
            System.out.println(head.val+" ");
        }
    }
}

package Lec42;

public class MergeSortInLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode middleNode(ListNode head){
        ListNode fast =head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
  }
  public class Solution{
        public ListNode sortList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode mid=middleNode(head);
            ListNode headb =mid.next;
            mid.next=null;
            ListNode A=sortList(head);
            ListNode B =sortList(headb);

        }
  }
}

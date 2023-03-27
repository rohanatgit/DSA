package Lec42;

public class MergeSortInLinkedList {
    public class ListNode {
        int val;
        Middle_of_the_Linked_List.ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, Middle_of_the_Linked_List.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

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

        }
    }

}

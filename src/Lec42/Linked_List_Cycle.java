package Lec42;

public class Linked_List_Cycle {
    public class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode head;
    private int size;
    private ListNode tail;

    public void addfirst(int item) {
        ListNode nn = new ListNode(item);
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = head.next;
            this.head = nn;
            this.size++;
        }
    }

    public void addlast(int item) {
        if (this.size == 0) {
            addfirst(item);
        }
        ListNode nn = new ListNode(item);
        this.tail.next = nn;
        this.tail = nn;
        size++;
    }

    public void CreateCycle() {
        this.tail.next = this.head;//circular
        this.tail.next = this.head.next;//cycle
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
public void display()
{
    ListNode temp=this.head;
    while(temp!=null){
        System.out.println(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println(".");
  }
}

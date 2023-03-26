package Lec41;

import java.util.LinkedList;

public class LinkdedListClient {
    public static void main(String[] args) throws Exception {
        LInkedList ll =new LInkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.display();
        ll.addlast(50);
        ll.display();
        System.out.println(ll.removeindex(2));
        ll.display();
        ll.addatindex(89,2);
        ll.display();
    }
}

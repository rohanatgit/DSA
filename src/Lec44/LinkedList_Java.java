package Lec44;

import java.util.LinkedList;

public class LinkedList_Java {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);//Add last
        list.add(20);
        list.add(20);
        list.add(1,20);
        list.add(40);
        list.add(50);
        list.add(60);//add last
        System.out.println(list);
        System.out.println(list.remove());//remove first
    }
}

//Add first and remo
package Heap;

import java.util.*;

public class Kth_largest_Element_in_an_Array {
    //    T.C=NlogK
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap
        //PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());//max heap
        int[] arr = {2, 3, 4, 5, 2, 3, 45, 6, 7, 2, 9};
        int k = 3;
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
    }
}

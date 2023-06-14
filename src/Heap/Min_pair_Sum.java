package Heap;

import java.util.PriorityQueue;

public class Min_pair_Sum {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,82,3,5,6,1,3};
    }
    public static int  Pair_Sum(int[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
        }
        return sum;
    }
}

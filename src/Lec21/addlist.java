package Lec21;

import java.util.ArrayList;
import java.util.List;

public class addlist {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,1,5};
        List<Integer> ll=new ArrayList<>();
        print(arr,0,1,ll);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
    }
    public static void print(int[] arr, int si, int tar, List<Integer> ll){
        if(si==arr.length){
            return;
        }

        if(arr[si]==tar){
            ll.add(si);
        }
        print(arr,si+1,tar,ll);
    }

}

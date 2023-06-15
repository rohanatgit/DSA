package Lec53Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class insertion_of_two_Arrays {
    public static void main(String[] args) {
        int [] arr={27,21,13,1,2,4,5,6};
        int arr2[]={94,45,3,2,1,4,5,6};

    }
    public static int[] insertion(int[] arr1,int[] arr2){
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i]+1));
            }
            else{
                map.put(arr1[i],1);
            }
        }

    }
}

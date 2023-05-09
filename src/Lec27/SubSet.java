package Lec27;

import
        java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(arr,0,ll,ans);
        System.out.println(ans);
    }
    public static void subset(int [] arr,int i,List<Integer>ll ,List<List<Integer>>ans){
        if(i==arr.length){
            //System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return ;
        }
        subset(arr,i+1,ll,ans);
        ll.add(arr[i]);
        subset(arr,i+1,ll,ans);
        ll.remove(ll.size()-1);
    }

}

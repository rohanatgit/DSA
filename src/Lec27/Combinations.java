package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
      boolean[] board=new boolean[4];
      int no_oqueen=2;
      List<Integer> ll=new ArrayList<>();
      List<List<Integer>> ans=new ArrayList<>();
      queen(board,no_oqueen,0,0,ll,ans);
        System.out.println(ans);
    }
    public static void queen(boolean board[],int tq,int qpsf,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(tq==qpsf){
            //System.out.println(ll);
            ans.add(new ArrayList<Integer>(ll));
            return ;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){//queen place nahi hai
                board[i]=true;//queen place
                ll.add(i+1);
                queen(board,tq,qpsf+1,i+1,ll,ans);
                ll.remove(ll.size()-1);
                board[i]=false;//undo
            }
        }
    }
}

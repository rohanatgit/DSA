package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Comb_Sum {
    public static void comb(int [] coin,int amount,List<Integer>ll,int idx,List<List<Integer>>ans) {
        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
            //System.out.println(ll);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                comb(coin, amount - coin[i], ll, i, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        int coin[]={2,3,6,7};
        int amount=7;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        comb(coin,amount,ll,0,ans);
        System.out.println(ans);
    }
}

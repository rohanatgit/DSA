package Lec22;

public class Coin_Toss_without2heads {
    public static void coin_Toss(int n,String ans){
        if(n==0){
            System.out.println(ans+" ");
            return ;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            coin_Toss(n - 1, ans + "H");
        }
        coin_Toss(n-1,ans+"T");
    }
    public static void main(String[] args) {
       coin_Toss(3,"");
    }
}

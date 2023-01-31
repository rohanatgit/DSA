package RecursionRevision;

public class CoinPermutation {
    public static void main(String[] args) {
       int amount=10;
       int coin[]={2,3,5,6};
       coin_Per(coin,amount,"");
    }
    public static void coin_Per(int coin[],int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                coin_Per(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
}

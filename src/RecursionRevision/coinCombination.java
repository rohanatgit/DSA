package RecursionRevision;

public class coinCombination {
    public static void main(String[] args) {
        int amount=10;
        int coin[]={2,3,5,6};
        coin_comb(coin,amount,"",0);
    }
    public static void coin_comb(int coin[],int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return ;
        }

        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i])
            {
                coin_comb(coin,amount-coin[i],ans+coin[i],i);
            }
        }
    }
}

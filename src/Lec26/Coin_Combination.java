package Lec26;

public class Coin_Combination {
    public static void printcom(int coin[],int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return ;
        }

        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                printcom(coin,amount-coin[i],ans+coin[i],i);
            }
        }
    }
    public static void main(String[] args) {
        int [] coin={2,3,5,6};
        int amount=10;
        printcom(coin,amount,"", 0);
    }
}

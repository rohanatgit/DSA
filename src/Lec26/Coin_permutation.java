package Lec26;

public class Coin_permutation {
    public static void printpermutation(int coin[],int amount,String ans){
          if(amount==0){
              System.out.println(ans);
              return ;
          }
        //Jitne coin utne possibility
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                printpermutation(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
    int coin[] ={2,3,5,6};
    int amount=10;
        printpermutation(coin,amount,"");
    }
}

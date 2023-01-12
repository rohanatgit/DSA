package Lec25;

public class Queen_Permutation {
    public static void Queen (boolean [] board ,int tq,int qpsf,String ans){
        //tq=total Queen
        //qpsf ---> Queen Place sooooooooo far
        if(tq==qpsf){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){//Queen place nahi hai
                board[i]=true;//Queen place
                Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+"");
            }
        }

    }
    public static void main(String[] args) {
        boolean [] board =new boolean[4];
         int n=2;// 2 queen bethane hai
        Queen(board,n,0,"");

    }
}

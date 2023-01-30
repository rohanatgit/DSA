package RecursionRevision;

public class QueenPermutation {
    public static void main(String[] args) {
        boolean[] board=new boolean[4];
        int no_of_queen=2;
        permutation(board,no_of_queen,0,"");
    }
    public static void permutation(boolean[] board,int tq,int qpsf,String ans){
        //tq==total Queen
        //qpsf=== Queen Place so Far
        //Jitni size utni choice
        if(tq==qpsf){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){//queen place nahi hai
                board[i]=true;
                permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
                board[i]=false;
            }
        }
    }
}

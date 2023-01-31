package RecursionRevision;

public class QueenCombination {
    public static void main(String[] args) {
        boolean[] board=new boolean[4];
        int no_of_queen=2;
        per(board,no_of_queen,0,"",0);
    }
    public static void per(boolean[] board,int tq,int qpsf,String ans,int idx){
        //tq===total queen
        //qpsf===queen place so far
    if(tq==qpsf){
        System.out.println(ans);
        return;
    }

        for(int i=idx;i<board.length;i++){
            if(board[i]==false){//queen place nahi hai
                board[i]=true;//queen place
                per(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
                board[i]=false;//undo
            }
        }
    }
}

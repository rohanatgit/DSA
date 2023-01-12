package Lec25;

public class Queen_Combination {
    public static void queen_Com(boolean board[],int tq,int qpsf,String ans,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return ;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                queen_Com(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
                board[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        boolean board[]=new boolean[4];
        queen_Com(board,2,0,"",0);
    }
}

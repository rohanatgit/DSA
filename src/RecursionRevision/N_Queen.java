package RecursionRevision;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board=new boolean[n][n];
        printpath(board,0,n);
    }
    public static void printpath(boolean[][] board,int row ,int tq){
        if(tq==0){
            display(board);
            return ;
        }
        if(row==board.length){
            return ;
        }

        for(int col=0;col<board.length;col++){
            if(itispossible(board,row,col)==true){
                  board[row][col]=true;
                  printpath(board,row+1,tq-1);
                  board[row][col]=false;
            }
        }
    }
    public static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.println(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("************************");
    }
    public static boolean itispossible(boolean[][] board,int row,int col){
        //uppercase
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            c--;
            r--;
        }
        //right diaginal
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            c++;
            r--;
        }
    return true;
    }
}
//
package RecursionRevision;

public class sudukosolver {
    public static void display(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        sudokuSolver(grid,0,0);

    }
    public static void sudokuSolver(int[][] grid,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(grid);
            return;
        }
        if(grid[row][col]!=0){
            sudokuSolver(grid,row,col+1);
        }
        else{
            for(int val=1;val<=9;val++){
                if(isitpossible(grid,row,col,val)==true){
                    grid[row][col]=val;
                    sudokuSolver(grid,row,col+1);
                    grid[row][col]=0;
                }
            }
        }
    }
    public static boolean isitpossible(int[][] grid,int row,int col,int val) {
        //row kai leye
        int c=0;
        while(c<9){
            if(grid[row][c]==val){
                return false;
            }
            c++;
        }
        //col kai leye
        int r=0;
        while(r<9){
            if(grid[r][col]==val){
                return false;
            }
            r++;
        }
        //3*3 Matrix kai leye
        r=row-row%3;
        c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
}

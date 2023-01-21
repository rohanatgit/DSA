package Lec30;

public class Sudoku_Solver {
public static boolean itispossible(int grid[][],int col,int row,int val){

    //Row mai check karne k leye
    int c=0;
    while(c<9){
        if(grid[row][c]==val){
            return false;
        }
        c++;
    }
    //col mai check karge ab
    int r=0;
    while(r<9){
     if(grid[r][col]==val){
         return false;
     }
     r++;
    }
    //Ab matrix mai check karege 3*3 mai kaise check karege ab baat yha ati hai guru


    return false;
}
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        sudokuSolver(grid,0,0);
        //0 means koi number nahi hai
    }
    public static void sudokuSolver(int[][] grid , int row,int col){
        if(col==9){
            row++;//agli row mai ja aur col ki value 0 kar de
            col=0;
        }
        if(row==9){
            Display(grid);
            return ;
        }
        if(grid[row][col]!=0){
            sudokuSolver(grid,row,col+1);
        }
        else{
            for(int val=1;val<=9;val++){
                if(itispossible(grid,row,col,val)==true){
                    grid[row][col]=val;
                    sudokuSolver(grid,row,col+1);
                    grid[row][col]=0;//undo
                }
            }
        }
    }
    public static void Display(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.println(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}

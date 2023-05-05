package Lec28;

public class N_Queen {
    public static boolean isitpossible(boolean[][] board, int row, int col) {
        //Upper Case
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }
        //left digonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void n_queen(boolean[][] board, int row, int tq) {//tq ==> total queen
        if (tq == 0) {//sab queen ko betha deya hai
            Display(board);
            return;
        }
        if (row == board.length) {
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isitpossible(board, row, col) == true) {
                board[row][col] = true;
                n_queen(board, row + 1, tq - 1);//beacuse always we started 0s
                board[row][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        n_queen(board, 0, n);
    }

    public static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*************************");
    }
}
//jitne col utne possible
//n queen bethana hai hmko
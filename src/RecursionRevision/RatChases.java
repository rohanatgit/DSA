package RecursionRevision;

import java.util.Scanner;

public class RatChases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int ans[][] = new int[n][m];
        printPath(maze, 0, 0, ans);
    }

    public static void printPath(char[][] maze, int cr, int cc, int[][] ans) {
        if(cc==maze[0].length-1 && cr==maze.length-1){
            display(ans);
            return ;
        }
        if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
            return;
        }
        int r[] = {0, -1, 0, 1};
        int c[] = {1, 0, -1, 0};
        maze[cr][cc] = '0';
        ans[cr][cc] = 1;
        for (int k = 0; k < r.length; k++) {
            printPath(maze, cr + r[k], cc + c[k], ans);
        }
        maze[cr][cc] = '0';
        maze[cr][cc] = 0;
    }

    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
               for(int j=0;j<ans[0].length;j++){
                   System.out.print(ans[i][j]+" ");
               }
            System.out.println();
        }
    }
}
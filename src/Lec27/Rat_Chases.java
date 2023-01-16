package Lec27;

import java.util.Scanner;

public class Rat_Chases {
    public static void printpath(char[][] maze,int cr,int cc,int [][] ans){
        if(cc==maze[0].length-1 && cr==maze.length-1 ){
            display(ans);
            return ;
        }
        if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze.length||maze[cr][cc]=='X'){
            return;
        }
        int r[]={0,-1,0,1};
        int c[]={1,0,-1,0};
//        printpath(maze,cr,cc+1,ans);//right
//        printpath(maze,cr-1,cc,ans);//up
//        printpath(maze,cr,cc-1,ans);//left
//        printpath(maze,cr+1,cc,ans);//down
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        for(int i=0;i<c.length;i++){
            printpath(maze,cr+r[i],cc+c[i],ans);
        }
        maze[cr][cc]='O';//baktracking
        ans[cr][cc]=1;//backtracking
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for(int i=0;i<maze.length;i++){
         String s=sc.next();
         for(int j=0;j<s.length();j++){
             maze[i][j]=s.charAt(j);
         }
        }
        int[][] ans=new int[n][m];
        printpath(maze,0,0,ans);
    }
    public static void display(int [][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

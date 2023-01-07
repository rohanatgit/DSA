package Lec22;

public class BoardPath {
    public static int board_path(int end,int curr,String ans){
       if(curr==end){
           System.out.println(ans);
           return 1;
       }
       if(curr>end){
           return 0;
       }
        int fp=board_path(end,curr+1,ans+1);
        int sp=board_path(end,curr+2,ans+2);
        int tb=board_path(end,curr+3,ans+3);
        return fp+sp+tb;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("/n"+board_path(n,0,""));
    }
}

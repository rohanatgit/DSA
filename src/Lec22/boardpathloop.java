package Lec22;

public class boardpathloop {
    public static int board_path(int end,int curr,String ans){
         if(curr==end){
             System.out.println(ans+"");
             return 1 ;
         }
         if(curr>end){
             return 0;
         }
//        int fp=board_path(end,curr+1,ans+1);
//        int sp=board_path(end,curr+2,ans+2);
//        int tp=board_path(end,curr+3,ans+3);
//        return fp+sp+tp;
        int count=0;
         for(int dice=1;dice<=3;dice++){
             count=count+board_path(end,curr+dice,ans+dice);
         }
         return count;
    }
    public static void main(String[] args) {
        System.out.println(board_path(3,0,""));
    }
}

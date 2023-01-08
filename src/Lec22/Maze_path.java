package Lec22;

public class Maze_path {
    public static void print_path(int er,int ec,int cr,int cc,String ans){
        //er = end row
        //ec =end col
        //cc = current col
        //cr = current row
        if(cc==ec && cr==er){
            System.out.println(ans);
            return ;
        }
        if(cc>ec || cr>er){
            return ;
        }


        print_path(er,ec,cr,cc+1,ans+"H");
        print_path(er, ec,cr+1,cc,ans+"V");
    }
    public static void main(String[] args) {
        int m=4;
        int n=5;
    print_path(m-1,n-1,0,0,"");
    }
}

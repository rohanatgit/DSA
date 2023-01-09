package Lec24;

public class lexicocount {
    public static void print_counting(int curr,int end){
        System.out.println(curr);
        if(curr>end){
            return ;
        }
        int i=0;
        if (curr == 0) {
            i=1;
        }
        for(;i<=9;i++){
         print_counting(curr*10+i,end);
        }
    }
    public static void main(String[] args) {
        int n=1000;
        print_counting(0,n);
    }
}

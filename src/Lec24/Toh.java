package Lec24;

public class Toh {
    public static void printstep(int n ,String s ,String h ,String d){
        //s is src h is helper and d id dis
        //s--->A h---->B D--->C
        if (n == 0) {
            return ;
        }
        printstep(n-1,s,d,h);
        System.out.println("Move "+n+"th disc from "+s+"to"+d);
        printstep(n-1,h,s,d);
    }
    public static void main(String[] args) {
        int n=3;
        printstep(n,"A","B","C");
    }
}

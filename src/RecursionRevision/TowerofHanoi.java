package RecursionRevision;

public class TowerofHanoi {
    public static void main(String[] args) {
      int n=3;
      printstep(n,"src","hel","dis");
    }
    public static void printstep(int n,String s,String h,String d) {
        if(n==0){
            return ;
        }
        printstep(n-1,s,d,h);
        System.out.println("Move "+n+"th disc from "+s+" to"+d);
        printstep(n-1,h,s,d);
    }
}

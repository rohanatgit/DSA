package RecursionRevision;

public class bordPath {
    public static void main(String[] args) {
        int n=4;
        System.out.println("\n"+bordpath( n , 0,""));
    }
    public static int bordpath(int end,int curr,String ans){
//        if(curr>end){
//            System.out.println(ans);
//            return 1;
//        }
        if(curr==end){
            System.out.println(ans);
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int fp=bordpath(end,curr+1,ans+1);
        int sp=bordpath(end,curr+2,ans+2);
        int tp=bordpath(end,curr+3,ans+3);
        return fp+sp+tp;
    }
}

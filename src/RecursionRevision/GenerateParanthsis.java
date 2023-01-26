package RecursionRevision;

public class GenerateParanthsis {
    public static void generate(int n,int opening,int closing,String ans) {
        if(opening==n && closing==n){
            System.out.println(ans);
            return ;
        }
        if (opening < n) {
            generate(n, opening + 1, closing, ans + "(");
        }
        if (closing < opening) {
            generate(n, opening, closing + 1, ans + ")");
        }
    }
    public static void main(String[] args) {
               int n=3;
               generate(n,0,0,"");
    }
}

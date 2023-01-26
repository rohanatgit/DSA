package RecursionRevision;

public class TwoConsicutiveHead {
    public static void printcoin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return ;
        }

        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            printcoin(n - 1, ans + "H");
        }
            printcoin(n-1,ans+"T");

    }
    public static void main(String[] args) {
        int n=3;
        printcoin(n,"");
    }
}

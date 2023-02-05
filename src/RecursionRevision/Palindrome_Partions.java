package RecursionRevision;

public class Palindrome_Partions {
    public static void main(String[] args) {
       String str="nitin";
       String ans="";
       printPar(str,ans);
    }
    public static void printPar(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=1;i<=ques.length();i++) {
            String s = ques.substring(0, i);
            if (pal(s)) {
                printPar(ques.substring(i), ans + s + "|");
            }
        }
    }
    public static boolean pal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

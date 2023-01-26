package RecursionRevision;

public class PrintSubSequence {
    public static void subsequence(String ques,String ans ){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch=ques.charAt(0);
        subsequence(ques.substring(1),ans);
        subsequence(ques.substring(1),ans+ch);
    }
    public static void main(String[] args) {
     String str="abc";
     subsequence(str,"");
    }
}

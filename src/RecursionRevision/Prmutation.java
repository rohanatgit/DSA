package RecursionRevision;

public class Prmutation {
    public static void main(String[] args) {
        String str="abca";
     printpermutation(str,"");
    }
    public static void printpermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<ques.length();i++){
             char ch=ques.charAt(i);
            String ros= ques.substring(0,i)+ques.substring(i+1);
            printpermutation(ros,ans+ch);
        }
    }
}

package Lec21;

public class subsequenceCount {
    static int count=0;
    //1st ways
    public static void printsubsequence(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return ;

        }
        char ch=ques.charAt(0);
        printsubsequence(ques.substring(1),ans);
        printsubsequence(ques.substring(1),ans+ch);
    }
    public static void main(String[] args) {
        String str="abc";
        printsubsequence(str,"");
        System.out.println(count);
    }
    //2nd ways
    public static int printsubsequence2(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);

            return 1 ;

        }
        char ch=ques.charAt(0);
       int f1= printsubsequence2(ques.substring(1),ans);
        int f2=printsubsequence2(ques.substring(1),ans+ch);
        return f1+f2;
    }
}

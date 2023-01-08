package Lec22;

public class Permutation {
    public static void printPermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<ques.length();i++){
            String ros=ques.substring(0,i)+ques.substring(i+1);
            char ch=ques.charAt(i);
            printPermutation(ros,ans+ch);
        }
    }
    public static void main(String[] args) {
       String str="abc";
       printPermutation(str,"");
    }
}

package Recusion_Assignment;

public class Recursion_Keypad_Codes {
    static String[] key={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
      String str="12";
      kryboard(str,"");
    }
    public static void kryboard(String ques,String ans){
      if(ques.length()==0){
          System.out.println(ans);
          return ;
      }
        char ch=ques.charAt(0);
        String pressString=key[ch-48];
        for(int i=0;i<pressString.length();i++){
            kryboard(ques.substring(1),ans+pressString.charAt(i));
        }
    }
}

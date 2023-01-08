package Lec22;

public class Key_Paid {
    static String[] key={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public  static void printKeyPaid(String ques,String ans){//12
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch=ques.charAt(0);//'1'--->49
        String pressString=key[ch-48];
        for(int i=0;i<pressString.length();i++){
            printKeyPaid(ques.substring(1),ans+pressString.charAt(i));
        }

    }
    public static void main(String[] args) {
    String str="12";
    printKeyPaid(str,"");
    }
}

package RecursionRevision;

public class Key_Paid {
    static String[] key={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        String str="12";
        key_Paid(str,"");
    }
    public static void key_Paid(String ques,String ans){
       if(ques.length()==0){
           System.out.print(ans+" ");
           return ;
       }
        char ch =ques.charAt(0);//'1'   ------->49
        String pressString =key[ch-48];
        for(int i=0;i<pressString.length();i++){
            key_Paid(ques.substring(1),ans+pressString.charAt(i));
        }
    }
}

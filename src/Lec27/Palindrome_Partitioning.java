package Lec27;
import java.util.*;
public class Palindrome_Partitioning {
    public static boolean isPalidrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="nitin";
        //String ans="";
        List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();

        partition(str,list,ans);
        System.out.println(ans);
    }
    public static void partition(String ques,List<String>list, List<List<String>> ans){
        if(ques.length()==0){
           // System.out.println(list);
            ans.add(new ArrayList<String>(list));
            //return ;
        }
        for(int i=1;i<=ques.length();i++) {
            String s = ques.substring(0, i);
            if (isPalidrome(s)) {
                list.add(s);
                partition(ques.substring(i), list,ans );
                list.remove(list.size()-1);
            }
        }
    }
}

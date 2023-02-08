package Lec22;
import java.util.*;
public class GenerateParanthesis {
    public static void generateparathsis(int n,int opening,int closing,String ans,List<String> list){
        if(opening==n && closing==n){
            //System.out.println(ans);
            list.add(ans);
            return;
        }
        if(opening<n) {
            generateparathsis(n, opening + 1, closing, ans + "(",list);
        }
        if(closing<opening) {
            generateparathsis(n, opening, closing + 1, ans + ")",list);
        }
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        generateparathsis(4,0,0,"",list);
        System.out.println(list);
    }
}

/*
class Solution {
    public static void genepara(int n,int opening,int closing,String ans,List<String>list){
    if(opening==n && closing ==n){
        list.add(ans);
        return;
    }
   if(opening<n){
      genepara(n,opening+1,closing,ans+"(",list);
   }
   if(closing<opening){
      genepara(n,opening,closing+1,ans+")",list);
   }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list =new ArrayList<>();
        genepara(n,0,0,"",list);
        return list;
    }
}
* */
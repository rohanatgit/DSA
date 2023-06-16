package Lec53Hashing;

import java.util.*;

public class Group_Anagram  {
    public static void main(String[] args) {
        String[] atr={"eat","tea","tan","ate","nat","bat"};


    }
    public static List<List<String>>Anagram(String[] strs){

    }
    public static String GenerateKey(String s){
        int[ ] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(0);
            freq[ch-'a']=freq[ch-'a']+1;

        }
    }
}

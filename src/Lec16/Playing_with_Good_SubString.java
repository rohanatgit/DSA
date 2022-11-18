package Lec16;
//import ja

import java.util.Scanner;

public class Playing_with_Good_SubString {
    public static int playinggoodsubstring(String str){
        int ans=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowel(ch)==true){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        //nextLine() -- space read ho jata hai
        System.out.println(playinggoodsubstring(str));
    }
    public static boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}

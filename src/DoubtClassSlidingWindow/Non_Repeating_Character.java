package DoubtClassSlidingWindow;

import java.util.Scanner;

public class Non_Repeating_Character {
    public static int non_repating(String str){
        int si=0;
        int ei=0;
        int ans=0;
        int freq[]=new int[256];
        while(ei<str.length()){
            //window grow
         char ch=str.charAt(ei);
         freq[ch]=freq[ch]+1;
            //window shrink
            while(freq[ch]>1) {
                char c = str.charAt(si);
                freq[c] = freq[c] - 1;
                si++;
            }
            //ans cal
              ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
           // int k=sc.nextInt();
            System.out.println(non_repating(str));
        }
    }
}

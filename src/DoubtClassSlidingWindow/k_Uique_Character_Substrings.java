package DoubtClassSlidingWindow;

import java.util.Scanner;

public class k_Uique_Character_Substrings {
    public static int k_qnique_Character(String str,int k){
        int si=0;
        int ei=0;
        int ans=-1;
        int unique_count=0;
        int freq[] =new int[256];
        while(ei<str.length()){
            //window grow
         char ch=str.charAt(ei);
         if(freq[ch]==0){
             unique_count++;
         }
         freq[ch]=freq[ch]+1;
            // window small(shrink)
            while(unique_count>k){
                char c=str.charAt(si);
                freq[c]=freq[c]-1;
                if(freq[c]==0){
                    unique_count--;
                }
                si++;
            }
            //ans cal
            if(unique_count==k){
               ans=Math.max(ans,si-ei+1);
            }
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int k=sc.nextInt();
            System.out.println(k_qnique_Character(str,k));
        }
    }
}

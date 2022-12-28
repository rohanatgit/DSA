package DoubtClassSlidingWindow;

import java.util.Scanner;

public class minimum_number_from_given_sequence {
    public static void form_minimum_number(String str){
        int count=1;
        int [] ans=new int[str.length()+1];
        for(int i=0;i<=str.length();i++){
            if(i==str.length() || str.charAt(i)=='I'){
                ans[i]=count;
                count++;
                for(int j=i-1;j>=0 && str.charAt(j)!='I';j-- ){
                    ans[j]=count;
                    count++;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        form_minimum_number(str);
    }
}

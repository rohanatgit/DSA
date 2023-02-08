package Recusion_Doubt_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diactonry_Order {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>list=new ArrayList<>();
        printpermutation(str,"",str,list);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public static void printpermutation(String ques,String ans ,String org,ArrayList<String>list){
        if(ques.length()==0){
            if(ans.compareTo(org)>0) {
                //System.out.println(ans);
                list.add(ans);
            }
            return ;
        }

        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String ros=ques.substring(0,i)+ques.substring(i+1);
            printpermutation(ros,ans+ch,org,list);
        }
    }
}

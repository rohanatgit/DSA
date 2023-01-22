package Lec30;

import java.util.ArrayList;

public class String_Builder_Demo2 {
    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder("Hello");
//        System.out.println(sb.capacity(()));
//        ArrayList<Integer> al=new ArrayList<>();
//        System.out.println(al);
Stringprint();
    }
    public static void Stringprint(){
        String s="";
        for(int i=1;i<=100000;i++){
            s+=i;
            System.out.println(s);
        }
    }
    public static void StringBuilder(){
        StringBuilder s= new StringBuilder();
        for(int i=1;i<=100000;i++){
       //  s=s.append(i);
            System.out.println(s);
        }
    }
}

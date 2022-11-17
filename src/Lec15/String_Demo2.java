package Lec15;

public class String_Demo2 {
    public static void main(String[] args) {
        String str="hello";
        String str1="hello";
        String st=new String("hello");
        String st1=new String("hello");
        System.out.println(str1==st);//adress compare
        System.out.println(st1.equals(st));//contant compare krta hai
        System.out.println(str==str1);//true
    }
}

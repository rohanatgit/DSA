package Lec30;
import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        //sb.append("hello");
        System.out.println(sb);
        //System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        System.out.println(sb.reverse());
        System.out.println();
      String s=sb.toString();//builder to String
        //System.out.println(sb.capacity());
    }
}
//String builder string se fast hota hai
//(old capacity*2)+2
//class type ki sab heap mai banegi

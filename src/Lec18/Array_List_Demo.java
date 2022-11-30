package Lec18;
import java.util.*;
public class Array_List_Demo {
    public static void main(String[] args) {
        //Recursion m ArrayList use hoga bhai
        ArrayList<Integer> list=new ArrayList<>();//heap k andar khali list print hoga [] aisa
        //ArrayList<Integer> list=new ArrayList<Integer>(); optional
         //Add --Last mai add krna hota hai
        list.add(10);
        list.add(20);
        System.out.println(list);

        //add at index--Phle paar add krna hai
        list.add(0,30);
        System.out.println(list.size());

        //delete
        //range 0 to size-1
        System.out.println(list.remove(1));
        System.out.println(list);


        list.add(60);
        list.add(-20);

        //Get
        //range0 to size-1;
        System.out.println(list.get(3));
        System.out.println(list);

        //Set --> update index pr jaa kr
        list.set(1,9);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        //Enhence for loop
        for(int val:list){//val index ka value read kr raha hay
            System.out.println(val);
        }
        System.out.println();

        //2d array
//       array int [] [] a =new int[2][3];
//        for(int [] a1:a){
//            for(int i:a1){
//                System.out.println(i);
//            }
//        }


    }
}

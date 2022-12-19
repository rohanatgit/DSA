package Lec18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_User_Input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<4;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

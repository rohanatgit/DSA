package Lec53Hashing;

import java.util.HashSet;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(90);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(60);
        System.out.println(set);

        //remove
        System.out.println(set.remove(-90));

    }
}

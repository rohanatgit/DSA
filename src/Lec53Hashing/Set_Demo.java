package Lec53Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
    public static void main(String[] args) {
//        HashSet<Integer>set=new HashSet<>();
//        set.add(90);
//        set.add(30);
//        set.add(40);
//        set.add(50);
//        set.add(60);
//        set.add(60);
//        System.out.println(set);
//
//        //remove
//        System.out.println(set.remove(-90));
//        System.out.println(set.contains(99));
//
//
//

      //TreeSet
      TreeSet<Integer>set1=new TreeSet<>();
      set1.add(99);
      set1.add(90);
        System.out.println(set1);


        //LinkedHashSet
        LinkedHashSet<Integer>set2=new LinkedHashSet<>();
        set2.add(-90);
    }

}

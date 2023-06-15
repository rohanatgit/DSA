package Lec53Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap_Demo {
    public static void main(String[] args) {
//         HashMap<String,Integer> map=new HashMap<>();
//         //add
//        map.put("piya",90);
//        map.put("nitish",77);
//        map.put("akash",67);
//        map.put(null,88);
//        System.out.println(map);
//
//        //get
//        //0(1)
//        System.out.println(map.get("Raj"));
//
//        System.out.println(map.get("Omika"));
//
//        //containsKey0(1)
//        System.out.println(map.containsKey("akash"));
//
//        //remove 0(1)
//        System.out.println(map.remove(map.remove("nitish")));

//        TreeMap<String,Integer>map1=new TreeMap<>();
//        //add
//        map1.put("sud",90);
//        map1.put("aksh singh",89);
//        map1.put("punnet",77);
//        System.out.println(map1);

        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        map.put("shivang",89);
        map.put("rohan",77);
        map.put("faraz",55);
        System.out.println(map);
    }
}

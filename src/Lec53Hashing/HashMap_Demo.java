package Lec53Hashing;

import java.util.HashMap;

public class HashMap_Demo {
    public static void main(String[] args) {
         HashMap<String,Integer> map=new HashMap<>();
         //add
        map.put("piya",90);
        map.put("nitish",77);
        map.put("akash",67);
        map.put(null,88);
        System.out.println(map);

        //get
        //0(1)
        System.out.println(map.get("Raj"));

        System.out.println(map.get("Omika"));

        //containsKey0(1)
        System.out.println(map.containsKey("akash"));

        //remove 0(1)
        System.out.println(map.remove(map.remove("nitish")));
    }
}

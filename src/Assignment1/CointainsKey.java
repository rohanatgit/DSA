package Assignment1;

import java.util.HashMap;

public class CointainsKey {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        //HashMap<Integer,String> hm2=new HashMap<>();
        hm1.put(1,"Red");
        hm1.put(2,"white");
        hm1.put(3,"yello");
        hm1.put(4,"white");
        hm1.put(5,"black");
        boolean result = hm1.isEmpty();
        System.out.println("Is hashMap empty "+result);
        hm1.clear();
        result= hm1.isEmpty();
        System.out.println("Is hashMap empty "+result);
    }
}

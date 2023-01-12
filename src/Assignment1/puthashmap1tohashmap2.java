package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class puthashmap1tohashmap2 {
    //putAll methord use in this prgram
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        //HashMap<Integer,String> hm2=new HashMap<>();
        hm1.put(1,"Red");
        hm1.put(2,"white");
        hm1.put(3,"yello");
        hm1.put(4,"white");
        System.out.println("the original linked map:"+hm1);
        hm1.clear();
        System.out.println(hm1);
    }
}

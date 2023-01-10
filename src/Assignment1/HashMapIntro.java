package Assignment1;
import java.util.HashMap;
import java.util.Map;
public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Red");
        hm.put(2,"white");
        hm.put(3,"yello");
        for(Map.Entry x:hm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        System.out.println(hm.size());
    }
}

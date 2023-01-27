package RecursionRevision;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthsis {
    public static void generate(int n,int opening,int closing,String ans,List<String> list) {
        if(opening==n && closing==n){
           // System.out.println(ans);
            list.add(ans);
            return ;
        }
        if (opening < n) {
            generate(n, opening + 1, closing, ans + "(",list);
        }
        if (closing < opening) {
            generate(n, opening, closing + 1, ans + ")",list);
        }
    }
    public static void main(String[] args) {
               int n=3;
               List<String> list=new ArrayList<String>();
        generate(n,0,0,"",list);
        System.out.println(list);
    }
}

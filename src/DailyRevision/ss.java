package DailyRevision;

import java.util.*;
public class ss {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                System.out.print("\n");

            }
            System.out.print(str.charAt(i));
        }
    }
}

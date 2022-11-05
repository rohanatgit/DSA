package Assignment1;
    import java.util.*;
    public class DecimalToOctal {
        public static void main(String args[]) {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(BtoD(n));
        }
        public static int BtoD(int n){
            int ans=0;
            int m=1;
            while(n>0){
                int rem=n%8;
                ans+=rem*m;
                m*=10;
                n=n/8;
            }
            return ans;
        }
    }



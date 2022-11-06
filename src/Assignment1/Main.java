package Assignment1;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        int  sum2=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            while(n>0){
                int rem=n%10;
                if(rem%2!=0){
                    sum=sum+rem;
                    n/=10;
                }
                else{
                    sum2=sum2+rem;
                    n=n/10;
                }
            }
        }
        if(sum/3==0){
            System.out.print("Yes");
        }
        else{
            if(sum/4==0){
                System.out.print("No");
            }
        }
    }
}

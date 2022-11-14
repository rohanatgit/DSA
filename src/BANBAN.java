import java.util.Scanner;

public class BANBAN {
    public static int solve(int n){
        int first=1;
        int last=3*n-1;
        System.out.println((n-1)/2);
        while(first<last){
            System.out.println(first+""+last);
            first+=3;
            last-=3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            int n=sc.nextInt();
            solve(n);
        }

    }
}

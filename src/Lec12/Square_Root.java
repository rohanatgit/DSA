package Lec12;

public class Square_Root {
    public static void main(String[] args) {
        int n=47;
        System.out.println(squareroot(n));
    }
    public static int squareroot(int n){
        int lo=1;
        int hi=n;
         int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid<=n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}

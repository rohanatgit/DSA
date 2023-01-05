package Lec21;

public class fact {
    public static int factt(int n,int ans){
        if(n==0){
            return ans;
        }
        return factt(n-1,ans*n);
    }
    public static void main(String[] args) {
        System.out.println(factt(5,1));
    }
}

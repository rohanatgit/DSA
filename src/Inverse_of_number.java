public class Inverse_of_number {
    public static void main(String[] args) {
        int n=32145;
        int ans=0;
        int pos=1;
        while(n>0){
            int rem=n%10;
            ans=(int)(ans+pos*(Math.pow(10,rem-1)));
            n=n/10;
            pos++;
        }
        System.out.println(ans);
    }
}

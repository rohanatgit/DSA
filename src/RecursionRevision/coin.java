package RecursionRevision;

public class coin {
    static int count=0;
    public static void counHT(int n,String ans){
        if(n==0){
            System.out.println(ans+" ");
            count++;
            return ;
        }

       counHT(n-1,ans+"H");
       counHT(n-1,ans+"T");
    }
    public static void main(String[] args) {
        int n=3;
        counHT(n,"");
        System.out.println(count);
    }
}

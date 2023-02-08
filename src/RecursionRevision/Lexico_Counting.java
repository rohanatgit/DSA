package RecursionRevision;

public class Lexico_Counting {
    public static void main(String[] args) {
     int n=13;
     printcount(0,n);
    }
    public static void printcount(int curr,int end){
        if(curr>end){
            return ;
        }
        if(curr!=0) {
            System.out.println(curr);
        }
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            printcount(curr*10+i,end);
        }
    }
}


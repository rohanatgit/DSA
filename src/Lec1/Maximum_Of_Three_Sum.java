package Lec1;

public class Maximum_Of_Three_Sum {
    public static void main(String[] args) {
        int a=9;
        int b=7;
        int c=78;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println("Ans -> "+c);
        }
    }
}

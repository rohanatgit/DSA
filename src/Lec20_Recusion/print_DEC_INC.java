package Lec20_Recusion;

public class print_DEC_INC {
    public static void print(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        System.out.println(5);
    }
}

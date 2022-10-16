package Lec1;

public class Grade_Card {
    public static void main(String[] args) {
        int m=78;
        if(m>=80){
            System.out.println("A");
        }
        else if(m>=70 && m<80){
            System.out.println("B");
        }
        else if(m>=60 && m<70){
            System.out.println("C");
        }
        else if(m>=50 && m<60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

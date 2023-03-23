package OOPS.ThrowKeyWordUse;

import java.util.Scanner;

public class youngerAgeEx extends RuntimeException{
    youngerAgeEx(String msg){
        super(msg);
    }

}
class Voting{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        if(age<18){
            throw new youngerAgeEx("Bhai kya kar raha hay tu age toh dhek le yaar kam se kam ");
        }
        else {
            System.out.println("OK Success");
        }
    }
}

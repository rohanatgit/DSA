package OOPS.UserInput;

public class UderAgeException extends Exception {
    UderAgeException() {
        super("You are under age");
    }

     UderAgeException(String msg) {
        System.out.println(msg);
    }
}
class Voting{
    public static void main(String args[]) throws UderAgeException {
        int age =17;
        if(age<18){
           throw new UderAgeException();
        }
    }
}

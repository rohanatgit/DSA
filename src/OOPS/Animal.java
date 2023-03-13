package OOPS;

public class Animal {
    public void eat(){
        System.out.println("I am eating ");
    }

    public static void main(String[] args) {
        System.out.println("Rohan 1");
        Animal buzo=new Animal();
        buzo.eat();
        bird bz=new bird();
        bz.fly();
    }
}
class bird {
    void fly() {
        System.out.println("I am flying");
    }
}
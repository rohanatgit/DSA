package OOPS.Lec6Abstraction;

abstract class Vehicle {
    abstract void start();
}
class car extends Vehicle{
    void start(){
        System.out.println("car start with the key");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("scooter starts with kick");
    }

    public static void main(String[] args) {
        car c=new car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}

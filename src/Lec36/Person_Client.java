package Lec36;

public class Person_Client {
    public static void main(String[] args) {
        Person p = new Person("karan",67);
        p.name = "Kaju";
        p.age = 23;
        p.fun();
        Person p1=new Person("bhadwa",76);
        p.name="Kunal";
        p.age=89;
        p.fun();
    }
}
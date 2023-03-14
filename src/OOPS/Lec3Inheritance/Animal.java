package OOPS.Lec3Inheritance;

class Animal {
       void eat(){
           System.out.println("I am Eating");
       }
}
class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

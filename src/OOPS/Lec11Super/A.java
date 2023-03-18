package OOPS.Lec11Super;

public class A {
       A(){
          System.out.println(" i am in class A");
      }
}
class B extends A{
    B(){
        super();
        System.out.println("B");
    }

    public static void main(String[] args) {
        B ob =new B();

    }
}

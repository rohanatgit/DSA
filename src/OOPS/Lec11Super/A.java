package OOPS.Lec11Super;

public class A {
       A(){
          System.out.println(" i am in class A");
      }
      int a=90;
}
class B extends A{
    B(){
        super();
        System.out.println(super.a);
        System.out.println("B");
    }

    public static void main(String[] args) {
        B ob =new B();
    }
}

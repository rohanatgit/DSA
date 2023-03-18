package OOPS.Lec12Final;

public class Test {
    final void m1(){
        System.out.println("i am in class Demo");
    }
}
class demo extends Test{
    void m1(){
        System.out.println("i am in class test");
    }

    public static void main(String[] args) {
        demo o=new demo();
        o.m1();
    }

}

package OOPS.Lec13StaticVariable.Staticmethord;

public class Test {
   static  void display(){
        System.out.println("1");
    }

    public static void main(String[] args) {
//        Test t =new Test();
//        t.display();
        Test.display();//no need to create object
        Xyz.show();
    }
}
class Xyz{
     static void show(){
        System.out.println("2");
    }
}

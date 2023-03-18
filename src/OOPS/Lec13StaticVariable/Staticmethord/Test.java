package OOPS.Lec13StaticVariable.Staticmethord;

public class Test {
   static  void display(){
        System.out.println("1");
    }

    public static void main(String[] args) {
//        Test t =new Test();
//        t.display();
        Test.display();//no need to create object
    }
}
class Xyz{
     void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.show();
    }
}

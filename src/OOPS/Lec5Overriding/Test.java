package OOPS.Lec5Overriding;

public class Test {
    void show(){
        System.out.println("1");
    }
}
class XYZ extends Test{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t =new Test();
        t.show();

        XYZ x =new XYZ();
        x.show();
    }
}

package OOPS.Lec13StaticVariable;

public class Test {
    int a=10;
}
class Demo{
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.a);
    }
}

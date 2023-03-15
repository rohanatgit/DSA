package OOPS.Lec4Polymorphism;

public class Test {
    void show(int a){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}

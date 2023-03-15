package OOPS.Lec4Polymorphism;

public class Test {
    void show(int a){
        System.out.println("1");
    }
    String show(){
        System.out.println("2");
        return "sdjn";
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}

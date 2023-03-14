package OOPS.Lec3Inheritance;

class A {
     void showA(){
        System.out.println("a class methord");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class methird");
    }

    public static void main(String[] args) {
        A ob1=new A();
        ob1.showA();
        //ob1.showB();
    }
}

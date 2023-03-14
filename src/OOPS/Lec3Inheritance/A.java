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

}
class C extends B{
    void showC(){
        System.out.println("c class methord");
    }

    public static void main(String[] args) {
        C cc=new C();

    }
}

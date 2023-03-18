package OOPS.Lec10thisUses;

public class thisdemo2 {
    void m1(){
        Test t =new Test(this);
    }
    public static void main(String[] args) {
        thisdemo2 td=new thisdemo2();
        td.m1();
    }
}
class Test{
    Test(thisdemo2 td){
        System.out.println("test class 2");
    }
}
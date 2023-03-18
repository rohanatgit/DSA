package OOPS.Lec10thisUses;

public class thisdemo2 {
    thisdemo2 m1() {
        System.out.println("hello");
        return this;
    }

    public static void main(String[] args) {
        thisdemo2 td = new thisdemo2();
        td.m1();
    }
}
//}
//class Test{
//    Test(thisdemo2 td){
//        System.out.println("test class 2");
//    }
//}
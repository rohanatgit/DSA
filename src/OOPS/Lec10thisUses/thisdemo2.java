package OOPS.Lec10thisUses;

public class thisdemo2 {
    void m1(thisdemo2 td){
        System.out.println("I am in m1 methord");
    }
    void m2(){
        m1(this);
    }

    public static void main(String[] args) {
        thisdemo2 td=new thisdemo2();
        td.m2();
    }
}

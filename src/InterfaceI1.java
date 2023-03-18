 abstract interface I12{
    public static  int a=10;
    abstract void myname();
}
interface i2  extends I12{
     default void myname() {

         System.out.println("dnd");
     }
    public  abstract void can();

}
class test implements i2{

    @Override
    public void can() {

    }

    public static void main(String[] args) {
        test t=new test();
        t.myname();

    }

}

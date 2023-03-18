package OOPS.Lec10thisUses;

public class thisDemo {
     thisDemo(){
         this(10);
         System.out.println("hello BHai");
     }
     thisDemo(int a){
         //this();//current class contrutor
         System.out.println("parametrized construtor");
     }
    public static void main(String[] args) {
        thisDemo td=new thisDemo();
    }
}

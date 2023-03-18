package OOPS.Lec10thisUses;

public class thisDemo {
     thisDemo(){
         System.out.println("hello BHai");
     }
     thisDemo(int a){
         System.out.println("parametrized construtor");
     }

    public static void main(String[] args) {
        thisDemo td=new thisDemo(10);
    }
}

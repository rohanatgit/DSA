package OOPS.Lec10thisUses;

public class thisDemo {

     void display(){
         System.out.println("hello BHai");
     }
     void show(){
         this.display();
     }

    public static void main(String[] args) {
        thisDemo td=new thisDemo();
        td.show();
    }
}

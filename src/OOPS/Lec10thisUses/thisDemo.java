package OOPS.Lec10thisUses;

public class thisDemo {
     int i;
     void setValue(int i){

     }
     void show(){
         System.out.println(i);
     }

    public static void main(String[] args) {
        thisDemo td=new thisDemo();
        td.setValue(100);
        td.show();
    }
}

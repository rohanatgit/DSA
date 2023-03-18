package OOPS.Lec9_thisKeyWord;

public class Test {
    int i; //instance variable
    void setvalue(int i){
       this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}
class xyz{
    public static void main(String[] args) {
        Test t =new Test();
        t.setvalue(10);
        t.show();
    }
}
package OOPS.Lec9_thisKeyWord;

public class Test {
    int i;
    void setvalue(int x){
        i=x;
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
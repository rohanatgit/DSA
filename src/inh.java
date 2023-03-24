public class inh {
    void show(){
        System.out.println("1");
    }

}
class exz extends inh{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        exz n =new exz();
        n.show();
    }
}

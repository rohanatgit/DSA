package OOPS;

public class Animal1 {
    String color;
    int age;
    void initObj(String c,int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        Animal1 buzo =new Animal1();
//        buzo.color="black";
//        buzo.age=10;
//        System.out.println(buzo.color+" "+buzo.age);
        buzo.initObj("black",20);
        buzo.display();


    }
}

package Lec36;

public class Person {
    String name;
    int age;
    //Constructor
//    public Person(){
//            this.name="Motu";
//            this.age=56;   // non peramitrized Constructor
//        //Constructor-> non return type
//        //Class ka data member //name,age hai
//    }
    //Perametrized Constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void fun(){
        int Adhar_no=399098;
        System.out.println(this.name+" "+this.age+" "+Adhar_no);
    }
}

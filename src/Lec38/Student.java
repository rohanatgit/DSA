package Lec38;

public class Student {
    String name;
    int age;

    public Student() {
    }
        public Student(String name,int age){
            this.age=age;
            this.name=name;
        }
        public String toString(){
        return this.name+" "+this.age;
        }

        public static int Helo(){
            System.out.println("My Name is NAme");
        }
}


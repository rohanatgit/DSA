package Lec35;

import java.util.Scanner;

public class Student_Client {
    public static void main(String[] args) {
        Student s=new Student();
        //new Student() ----> object new wale part obeject bhi instance bhi
        s.age=90;
        s.name="rohan";
        System.out.println(s.age);
        System.out.println(s.name);
      Student s1=new Student();
      s1.name="varshney";
      s.age=9090;

    }
}

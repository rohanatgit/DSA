package OOPS.Lec13StaticVariable;

public class Employee {
    int empid;
    String name;
    static String company="sp";
    Employee(int empid ,String name,String company){
        this.empid=empid;
        this.name=name;
        this.company=company;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {
       Employee e1=new Employee(101,"rohan","Sp");
       e1.display();
       Employee e2=new Employee(102,"Deepka","SP");
       e2.display();
    }
}

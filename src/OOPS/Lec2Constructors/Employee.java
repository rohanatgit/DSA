package OOPS.Lec2Constructors;

public class Employee {
    String name;
    int emp_id;
    Employee(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    public static void main(String[] args) {
        Employee e1=new Employee("ram",10);
        Employee e2=new Employee("syhum",90);

    }
}

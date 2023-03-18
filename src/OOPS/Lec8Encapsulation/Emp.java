package OOPS.Lec8Encapsulation;

public class Emp {
    private int empid;  // Data Hinding
    public void setEmpid(int eid){
        empid=eid;
    }
    public int getEmpid(){
        return empid;
    }

}
class Company{
    public static void main(String[] args) {
        Emp e= new Emp();
    }
}
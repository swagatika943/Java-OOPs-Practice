package Part2.Inheritance.Problem5;

public class Employee extends Person{
    int empId;
    double sal;
    public Employee(String name, int age, String address, int empId, double sal){
        super(name, age, address);
        this.empId=empId;
        this.sal=sal;
    }
    public void displayEmpDetails(){
        System.out.println("---------Emp Details--------");
        System.out.println("Id:"+empId);
        System.out.println("Sal:"+sal);
    }
}

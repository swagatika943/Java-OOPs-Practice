package Part2.Inheritance.Problem6;

public class Employee extends Person{
    int empId;
    double sal;
    public Employee(String name, int age, int empId, double sal){
        super(name, age);
        this.empId=empId;
        this.sal=sal;
    }
    public void displayEmployeeDetails(){
        System.out.println("-------Employee Details-------");
        System.out.println("Emp ID:"+empId);
        System.out.println("Sal:"+sal);
    }
}

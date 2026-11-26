package Part2.Polymorphism.Problem4;

public class Employee {
    String name;
    int empId;
    double sal;
    public Employee(String name, int empId, double sal){
        this.name=name;
        this.empId=empId;
        this.sal=sal;
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("EmpID:"+empId);
        System.out.println("Sal:"+sal);
    }
    public void work(){
        System.out.println("Employee is performing general tasks");
    }
}

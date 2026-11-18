package Part2.Inheritance.Problem7;

public class Employee {
    String name;
    int empId;
    double sal;
    public Employee(String name, int empId, double sal){
        this.name=name;
        this.empId=empId;
        this.sal=sal;
    }
    public void displayEmpDetails(){
        System.out.println("-------Emp Details---------");
        System.out.println("Name:"+name);
        System.out.println("Emp Id:"+empId);
        System.out.println("Sal:"+sal);
    }
}

package Part2.Inheritance.Problem1;
public class Employee {
    String name;
    int empId;
    double sal;

    public Employee(String name, int empId, double sal){
        super();
        this.name=name;
        this.empId=empId;
        this.sal=sal;
    }
    public void displayEmpDetails(){
        System.out.println("---------Emp Details---------");
        System.out.println("Name:"+name);
        System.out.println("EmpId:"+empId);
        System.out.println("Sal:"+sal);
    }
}

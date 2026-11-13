package Part2.Inheritance.Problem4;

public class Employee {
    String name;
    int empID;
    double sal;
    public Employee(String name, int empID, double sal){
        super();
        this.name= name;
        this.empID=empID;
        this.sal=sal;
    }
    public void displayEmpDetails(){
//      System.out.println("---------Emp Details--------");
        System.out.println("Name:"+name);
        System.out.println("Id:"+empID);
        System.out.println("Sal:"+sal);
    }
    public void work(){
        System.out.println("Employee is working");
    }
}

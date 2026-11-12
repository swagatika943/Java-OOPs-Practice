package Part2.Inheritance.Problem3;

public class Manager extends Employee{
    int teamSize;
    String department;
    public Manager(String name, int empID, double sal, int teamSize, String department){
        super(name, empID, sal);
        this.teamSize=teamSize;
        this.department=department;
    }
    public void displayManagerDetails(){
        System.out.println("----------Manager Details----------");
//        System.out.println("Name:"+name);
//        System.out.println("Id:"+empID);
//        System.out.println("Sal:"+sal);
        super.displayEmpDetails();
        System.out.println("TeamSize:"+teamSize);
        System.out.println("Department:"+department);
    }
}

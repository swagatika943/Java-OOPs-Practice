package Part2.Polymorphism.Problem4;

public class Manager extends Employee{
    int teamSize;
    public Manager(String name, int empId, double sal, int teamSize){
        super(name, empId, sal);
        this.teamSize=teamSize;
    }
    public void displayManagerDetails(){
        System.out.println("TeamSize:"+teamSize);
    }
    @Override
    public void work(){
        System.out.println("Manager is managing the team");
    }
}

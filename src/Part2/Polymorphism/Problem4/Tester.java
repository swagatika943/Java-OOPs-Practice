package Part2.Polymorphism.Problem4;

public class Tester extends Employee{
    String testingTool;
    public Tester(String name, int empId, double sal, String testingTool){
        super(name, empId, sal);
        this.testingTool=testingTool;
    }
    public void displayTesterDetails(){
        System.out.println("TestingTool:"+testingTool);
    }
    @Override
    public void work(){
        System.out.println("Tester is testing applications");
    }
}

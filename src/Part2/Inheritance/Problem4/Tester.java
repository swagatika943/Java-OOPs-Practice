package Part2.Inheritance.Problem4;

public class Tester extends Employee{
    String testingTool;
    String testingType;
    public Tester(String name, int empID, double sal, String testingTool, String testingType){
        super(name, empID, sal);
        this.testingTool=testingTool;
        this.testingType=testingType;
    }
    public void displayTesterDetails(){
        System.out.println("---------Tester Details----------");
        super.displayEmpDetails();
        System.out.println("TestingTool:"+testingTool);
        System.out.println("Testing Type:"+testingType);
    }
    @Override
    public void work(){
        System.out.println("Tester is testing the application");
    }
}

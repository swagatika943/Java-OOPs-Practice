package Part2.Inheritance.Problem7;

public class Developer extends Employee implements DeveloperActions{
    String programmingLanguage;
    String projectName;
    public Developer(String name, int empId, double sal, String programmingLanguage, String projectName){
        super(name,empId,sal);
        this.programmingLanguage=programmingLanguage;
        this.projectName=projectName;
    }
    public void displayDeveloperDetails(){
        System.out.println("--------Developer Details---------");
        System.out.println("Programming Language:"+programmingLanguage);
        System.out.println("Project Name:"+projectName);
    }
    @Override
    public void login(){
        System.out.println("Employee logged in successfully.");
    }
    @Override
    public void writeCode(){
        System.out.println("Developer is writing code.");
    }
    @Override
    public void logout(){
        System.out.println("Employee logged out successfully.");
    }
}

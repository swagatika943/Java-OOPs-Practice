package Part2.Inheritance.Problem4;

public class Developer extends Employee{
    String programmingLanguage;
    String projectName;
    public Developer(String name, int empId, double sal, String programmingLanguage, String projectName){
        super(name, empId, sal);
        this.programmingLanguage=programmingLanguage;
        this.projectName=projectName;
    }
    public void displayDeveloperDetails(){
        System.out.println("---------Devloper Details---------");
        super.displayEmpDetails();
        System.out.println("Programming language:"+programmingLanguage);
        System.out.println("Project Name:"+projectName);
    }
    @Override
    public void work(){
        System.out.println("Developer is writing code");
    }
}

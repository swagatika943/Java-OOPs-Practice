package Part2.Inheritance.Problem6;

public class Developer extends Employee implements Workable, Learner{
    String programmingLanguage;
    String projectName;
    public Developer(String name, int age,int empId, double sal, String programmingLanguage, String projectName){
        super(name, age, empId, sal);
        this.programmingLanguage=programmingLanguage;
        this.projectName=projectName;
    }
   public void displayDeveloperDetails(){
        System.out.println("-------Developer Details-------");
        System.out.println("Programming Language:"+programmingLanguage);
        System.out.println("Project Name:"+projectName);
   }
   @Override
    public void work(){
       System.out.println("Developer is writing code.");
   }
   public void learnNewTechnology(){
       System.out.println("Developer is learning Spring Boot.");
   }
}

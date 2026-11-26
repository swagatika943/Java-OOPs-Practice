package Part2.Polymorphism.Problem4;

public class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int empId, double sal, String programmingLanguage){
        super(name, empId, sal);
        this.programmingLanguage=programmingLanguage;
    }
    public void displayDeveloperDetails(){
        System.out.println("ProgrammingLanguage:"+programmingLanguage);
    }
    @Override
    public void work(){
        System.out.println("Developer is writing code");
    }
}

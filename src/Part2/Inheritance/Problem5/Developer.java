package Part2.Inheritance.Problem5;

public class Developer extends Employee{
    String programmingLanguage;
    int experience;
    public Developer(String name, int age, String address,int empId, double sal, String programmingLanguage,int experience){
        super(name, age, address, empId, sal);
        this.programmingLanguage=programmingLanguage;
        this.experience=experience;
    }
    public void displayDeveloperDetails(){
        System.out.println("---------Devloper Details---------");
        System.out.println("Programming language:"+programmingLanguage);
        System.out.println("Experience:"+experience);
    }
}

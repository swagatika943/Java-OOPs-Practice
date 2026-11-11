package Part2.Inheritance.Problem1;
public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int empId, double sal, String programmingLanguage) {
        super(name, empId, sal);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloperDetails() {
        System.out.println("--------Developer Deatails----------");
        System.out.println("Programming Language:" + programmingLanguage);
    }
}

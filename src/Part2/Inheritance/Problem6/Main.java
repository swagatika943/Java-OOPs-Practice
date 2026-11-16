package Part2.Inheritance.Problem6;

public class Main {
    public static void main(String[]args){
        Developer d = new Developer("Amrita", 23, 601, 800000, "Java", "Handle company Management");
        d.displayPersonDetails();
        System.out.println();
        d.displayEmployeeDetails();
        System.out.println();
        d.displayDeveloperDetails();
        System.out.println();
        d.work();
        d.learnNewTechnology();
    }
}

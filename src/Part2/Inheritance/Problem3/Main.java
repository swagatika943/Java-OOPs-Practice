package Part2.Inheritance.Problem3;

public class Main {
    public static void main(String[]args){
        Developer d = new Developer("Amrita", 100, 50000, "Java","Company Managment");
        d.displayDeveloperDetails();
        Manager m = new Manager("Swagatika", 200, 8000000, 9, "Development");
        m.displayManagerDetails();
    }
}

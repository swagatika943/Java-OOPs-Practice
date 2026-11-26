package Part2.Polymorphism.Problem4;

public class Main {
    public static void main(String[]args){
        System.out.println("----------- Employee Management System------------");
        Developer d = new Developer("Swagatika", 101, 50000, "Java");
        d.displayDetails();
        d.displayDeveloperDetails();
        d.work();
        System.out.println();
        Tester t = new Tester("Amrita", 102, 45000, "UI automation");
        t.displayDetails();
        t.displayTesterDetails();
        t.work();
        System.out.println();
        Manager m = new Manager("Luncy", 103, 70000, 7);
        m.displayDetails();
        m.displayManagerDetails();
        m.work();
    }
}

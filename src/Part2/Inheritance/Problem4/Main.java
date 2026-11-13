package Part2.Inheritance.Problem4;

public class Main {
    public static void main(String[]args){
        Developer d = new Developer("Swagatika", 100, 700000, "Java","Handle Company");
        d.displayDeveloperDetails();
        d.work();
        Tester t = new Tester("Amrita",200,400000,"Selenium","Automation");
        t.displayTesterDetails();
        t.work();

        //Runtime Polymorphism (Dynamic Method Dispatch)
//        Employee e1 = new Developer("Swagatika", 100, 700000, "Java", "Company");
//        Employee e2 = new Tester("Amrita", 200, 400000, "Selenium", "Automation");
//        e1.work();
//        e2.work();


    }
}

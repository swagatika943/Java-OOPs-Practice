package Part2.Inheritance.Problem7;

public class Main {
    public static void main(String[]args){
        Developer d = new Developer("Swagatika", 1212, 9000000, "JAVA", "CampusHub");
        d.displayEmpDetails();
        System.out.println();
        d.displayDeveloperDetails();
        System.out.println();
        d.login();
        d.writeCode();
        d.logout();
    }
}

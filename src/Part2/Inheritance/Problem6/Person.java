package Part2.Inheritance.Problem6;

public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayPersonDetails(){
        System.out.println("-------Person Details-------");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

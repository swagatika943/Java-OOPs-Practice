package Part2.Inheritance.Problem5;

public class Person {
    String name;
    int age;
    String address;
    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void displayPersonDetails(){
        System.out.println("---------Person Details--------");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
    }
}

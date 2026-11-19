package Part2.Polymorphism.Problem1;

public class Main {
    public static void main(String[]args){
        Calculator c = new Calculator();
        System.out.println("Addition of two integers: "+c.add(15,15));
        System.out.println("Addition of three integers: "+c.add(40, 10, 10));
        System.out.println("Addition of two decimal numbers: "+c.add(10.2, 5.15));
        System.out.println("Multiplication of two integers: "+c.multiply(100,2));
        System.out.println("Multiplication of three integers: "+c.multiply(10,20,30));
    }
}

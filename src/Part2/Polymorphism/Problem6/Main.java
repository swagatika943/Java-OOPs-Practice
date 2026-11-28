package Part2.Polymorphism.Problem6;

public class Main {
    public static void main(String[]args){
        System.out.println("----------Shape Area Calculater-----------");
        System.out.println();
        Shape[] s = new Shape[3];
        s[0] = new Circle(7, 9.0);
        s[1] = new Rectangle(6.0, 2.0, 6.0);
        s[2] = new Triangle(8.0, 3.0, 9.0);

        for(int i =0; i<s.length; i++){
            s[i].calculateArea();
            s[i].displayArea();
            System.out.println();
        }
    }
}

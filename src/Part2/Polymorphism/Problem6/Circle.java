package Part2.Polymorphism.Problem6;

public class Circle extends Shape{
    double radius;
    public Circle(double area, double radius){
        super(area);
        this.radius=radius;
    }
    public void displayArea(){
        System.out.println("Circle Area:"+area);
    }
    @Override
    public void calculateArea(){
        area = 3.14 * radius * radius;
    }
}

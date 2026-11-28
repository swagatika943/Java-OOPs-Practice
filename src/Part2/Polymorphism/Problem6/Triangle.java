package Part2.Polymorphism.Problem6;

public class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double area, double base, double height){
        super(area);
        this.base=base;
        this.height=height;
    }
    public void displayArea(){
        System.out.println("Triangle Area:"+area);
    }
    @Override
    public void calculateArea(){
        area = 0.5 * base * height;
    }
}

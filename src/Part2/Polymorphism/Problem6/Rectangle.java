package Part2.Polymorphism.Problem6;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double area, double length, double width){
        super(area);
        this.length=length;
        this.width=width;
    }
    public void displayArea(){
        System.out.println("Rectangle Area:"+area);
    }
    @Override
    public void calculateArea(){
        area = length * width;
    }
}

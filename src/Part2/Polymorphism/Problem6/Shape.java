package Part2.Polymorphism.Problem6;

public class Shape {
    double area;
    public Shape(double area){
        this.area=area;
    }
    public void calculateArea(){
        System.out.println("Calculating general shape area");
    }
    public void displayArea(){
        System.out.println("Area:"+area);
    }
}

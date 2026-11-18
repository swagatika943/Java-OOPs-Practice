package Part2.Inheritance.Problem8;

public class Device {
    String brand;
    String model;
    public Device(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public void displayDeviceDetails(){
        System.out.println("--------Device Details---------");
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
    }
}

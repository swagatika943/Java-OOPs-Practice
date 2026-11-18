package Part2.Inheritance.Problem8;

public class SmartPhone extends Device implements SmartDevice{
    double price;
    public SmartPhone(String brand, String model, double price){
        super(brand,model);
        this.price = price;
    }
    public void displaySmartPhoneDetails(){
        System.out.println("---------DisplaySmartPhoneDetails---------");
        System.out.println("Price:"+price);
    }
    @Override
    public void takePhoto(){
        System.out.println("Camera is taking a photo");
    }
    @Override
    public void playMusic(){
        System.out.println("Music is playing");
    }
    @Override
    public void makeCall(){
        System.out.println("Making a phone call");
    }
}

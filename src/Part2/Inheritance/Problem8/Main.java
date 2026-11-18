package Part2.Inheritance.Problem8;

public class Main {
    public static void main(String[]args){
        SmartPhone s = new SmartPhone("Samsung", "S24", 75000);
        s.displayDeviceDetails();
        System.out.println();
        s.displaySmartPhoneDetails();
        System.out.println();
        s.takePhoto();
        s.playMusic();
        s.makeCall();
    }
}

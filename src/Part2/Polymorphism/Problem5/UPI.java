package Part2.Polymorphism.Problem5;

public class UPI extends Payment{
    String upiId;
    public UPI(double amt, String upiId){
        super(amt);
        this.upiId=upiId;
    }
    @Override
    public void pay(){
        System.out.println("Payment processed through UPI");
    }
}

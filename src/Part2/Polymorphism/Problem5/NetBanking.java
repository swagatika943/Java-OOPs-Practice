package Part2.Polymorphism.Problem5;

public class NetBanking extends Payment{
    String bankName;
    public NetBanking(double amt, String bankName){
        super(amt);
        this.bankName=bankName;
    }
    @Override
    public void pay(){
        System.out.println("Payment processed through Net Banking");
    }
}

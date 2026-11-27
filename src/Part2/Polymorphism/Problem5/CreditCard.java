package Part2.Polymorphism.Problem5;

public class CreditCard extends Payment{
    String cardNum;
    public CreditCard(double amt, String cardNum){
        super(amt);
        this.cardNum=cardNum;
    }
    @Override
    public void pay(){
        System.out.println("Payment processed through Credit Card");
    }
}

package Part2.Polymorphism.Problem5;

public class Payment {
    double amt;
    public Payment(double amt){
        this.amt=amt;
    }
    public void displayAmt(){
        System.out.println("Amount:"+amt);
    }
    public void pay(){
        System.out.println("Processing general payment");
    }
}

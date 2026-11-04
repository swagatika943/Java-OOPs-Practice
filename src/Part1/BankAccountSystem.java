package Part1;

public class BankAccountSystem {
    String name;
    long acnum;
    double bal;

    public BankAccountSystem(String name, long acnum, double bal ){
        this.name=name;
        this.acnum=acnum;
        this.bal=bal;
    }
    public void deposite(double amt){
        bal = bal+amt;
        System.out.println("New balance:"+bal);
    }
    public void withdrawal(double amt){
        if(bal>=amt){
            bal = bal+amt;
            System.out.println("New balance is:"+bal);
        }else{
            System.out.println("Insufficient bal");
        }
    }
    public void details(){
        System.out.println("name");
        System.out.println("acnum");
        System.out.println("bal");
    }
}

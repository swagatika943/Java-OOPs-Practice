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
        if(amt>0){
            bal=bal+amt;
            System.out.println("Deposited Amt:"+amt);
            System.out.println("New bal:"+bal);
        }else{
            System.out.println("Invalid deposit amt");
        }
    }
    public void withdrawal(double amt){
        if(amt<=0){
            System.out.println("Invalid amt");
        }else if (bal>=amt){
            bal=bal-amt;
            System.out.println("Withdrawn Amt:"+amt);
            System.out.println("New Balamce:"+bal);
        }else{
            System.out.println("Insufficient bal");
        }
    }
    public void details(){
        System.out.println("Owner name:"+name);
        System.out.println("Acnum:"+acnum);
        System.out.println("Available Bal"+bal);
    }
}

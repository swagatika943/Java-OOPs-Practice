package Part1;

public class MultipleBankAcMang {
    String name;
    long AcNo;
    double Bal;
    public MultipleBankAcMang(String name, long AcNo, double Bal){
        this.name=  name;
        this.AcNo = AcNo;
        this.Bal = Bal;
    }
    public void deposite(double amt){
        if(amt > 0){
            Bal = Bal + amt;
            System.out.println("Deposite:"+amt);
        }else{
            System.out.println("Invalid deposit amt");
        }
    }
    public void withdraw(double amt){
        if(amt <= 0){
            System.out.println("Not acceptable");
        } else if (Bal >= amt) {
            Bal = Bal - amt;
            System.out.println("Withdraw:"+amt);
        }else {
            System.out.println("Insufficient Bal");
        }
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("ACno:"+AcNo);
        System.out.println("Bal:"+Bal);
    }
}

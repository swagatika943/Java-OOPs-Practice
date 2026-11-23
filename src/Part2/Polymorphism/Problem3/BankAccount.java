package Part2.Polymorphism.Problem3;

public class BankAccount {
    String name;
    int acNum;
    double bal;
    public BankAccount(String name){
        this(name, 0, 0.0);
    }
    public BankAccount(String name, int acNum){
        this(name, acNum, 0.0);
    }
    public BankAccount(String name, int acNum, double bal){
        this.name=name;
        this.acNum=acNum;
        this.bal=bal;
    }
    public void deposit(double amt) {
        if (amt > 0) {
            bal = bal + amt;
            System.out.println("Deposit Successful:" + amt);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
        public void deposit(double amt, String description){
            if (amt > 0) {
                bal = bal + amt;
                System.out.println("Deposit Successful: " + amt);
                System.out.println("Deposit Description: " + description);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }
        public void withdraw(double amt) {

            if (amt <= 0) {
                System.out.println("Invalid withdrawal amount");
            }
            else if (amt <= bal) {
                bal = bal- amt;
                System.out.println("Withdrawal Successful: " + amt);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        public void displayDetails() {
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + acNum);
            System.out.println("Balance: " + bal);
        }
    }

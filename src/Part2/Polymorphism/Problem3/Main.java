package Part2.Polymorphism.Problem3;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Bank Account Management -------");
        System.out.println();

        // Creating account using constructor 3
        BankAccount account = new BankAccount("Swagatika", 1001, 5000);
        account.displayDetails();
        System.out.println();

        // Deposit with description
        account.deposit(2000, "Salary");
        System.out.println();

        // Deposit without description
        account.deposit(1000);
        System.out.println();

        // Withdraw money
        account.withdraw(1500);
        System.out.println();
        System.out.println("------- Updated Account Details -------");
        account.displayDetails();
    }
}

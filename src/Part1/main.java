package Part1;

public class main {
    public static void main(String []args){
        BankAccountSystem b = new BankAccountSystem("Amrita", 9876543l, 1000000);
        b.deposite(700.0);
        b.withdrawal(211.0);
        b.details();
    }
}

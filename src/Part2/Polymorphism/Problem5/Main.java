package Part2.Polymorphism.Problem5;

public class Main {
    public static void main(String[]args) {
        System.out.println("------- Payment Processing System -------");
        System.out.println();

        Payment[] payments = new Payment[3];

        payments[0] = new CreditCard(5000, "123456789");
        payments[1] = new UPI(2500, "swagatika@upi");
        payments[2] = new NetBanking(10000, "SBI");

        for (int i = 0; i < payments.length; i++) {

            payments[i].displayAmt();

            payments[i].pay();

            System.out.println();
        }
    }
}

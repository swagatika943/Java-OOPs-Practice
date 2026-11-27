package Part2.Polymorphism.Problem5;

public class Main {
    public static void main(String[]args) {
        System.out.println("------- Payment Processing System -------");
        System.out.println();

        Payment[] p = new Payment[3];

        p[0] = new CreditCard(5000, "123456789");
        p[1] = new UPI(2500, "swagatika@upi");
        p[2] = new NetBanking(10000, "SBI");

        for (int i = 0; i < p.length; i++) {

            p[i].displayAmt();

            p[i].pay();

            System.out.println();
        }
    }
}

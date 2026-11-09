package Part1;

public class main {
    public static void main(String []args){
        //BankAccount System
//        BankAccountSystem b = new BankAccountSystem("Amrita", 9876543l, 1000000.0);
//        b.deposite(700.0);
//        b.withdrawal(211.0);
//        b.details();

        //Emplyoee Sal
//        EmployeeSalary emp1 = new EmployeeSalary(101, "Swagatika", 30000);
//
//        emp1.TotalList();

        //Student Result
//        int[] marks = {89, 90, 87, 93, 96};
//        StudentResult s = new StudentResult("Amrita", 39, marks);
//        s.displayResult();

        //Product Inventory
//        ProductInventory p = new ProductInventory(100, "PC", 70000, 4);
//        p.displayProductDetails();
//        System.out.println("\nAfter Upadte Quantity:");
//        p.updateQuantity(2);
//        p.displayProductDetails();

        //MultipleBankAcMang
        MultipleBankAcMang[] ac = new MultipleBankAcMang[3];
        ac[0] = new MultipleBankAcMang("Amrita", 1, 1000000);
        ac[1] = new MultipleBankAcMang("Swayan", 2, 30000);
        ac[2] = new MultipleBankAcMang("Swagatika", 3, 799000);

        ac[0].deposite(2000);
        ac[1].withdraw(4000);

        System.out.println("----All BanK Ac----");
        for(int i = 0; i<ac.length; i++){
            ac[i].displayDetails();
        }
        MultipleBankAcMang highest = ac[0];
        for(int i=1; i<ac.length; i++){
            if(ac[i].Bal> highest.Bal){
                highest = ac[i];
            }
        }
        System.out.println("----Highest Bal Ac----");
        System.out.println("Ac Holder:"+highest.name);
        System.out.println("Highest Bal:"+highest.Bal);
    }
}

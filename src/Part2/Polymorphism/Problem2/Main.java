package Part2.Polymorphism.Problem2;

public class Main {
    public static void main(String[]args){
        EmpSalary e = new EmpSalary();
        System.out.println("--------Employee Salary Calculator---------");
        System.out.println();
        System.out.println("Basic Sal:"+e.calculateSalary(25000));
        System.out.println("Sal with Bonus:"+e.calculateSalary(1500, 1500));
        System.out.println("Sal with HRA:"+e.calculateSalary(140089,14009));
        System.out.println("Sal with Bonus and Incentive:"+e.calculateSalary(25000,1500,1000));
        System.out.println("Final Sal with HRA and Bonus:"+e.calculateSalary(14000,1500,1000));
    }
}

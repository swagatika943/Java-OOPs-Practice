package Part2.Polymorphism.Problem2;

public class EmpSalary {
    public int calculateSalary(int basic){
        return basic;
    }
    public int calculateSalary(int basic, int bonus){
        return basic + bonus;
    }
    public double calculateSalary(double basic, double hra){
        return basic + hra;
    }
    public int calculateSalary(int basic, int bonus, int incentive){
        return basic + bonus + incentive;
    }
    public double calculateSalary(double basic, double hra, double bonus){
        return basic + hra + bonus;
    }
}

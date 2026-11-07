package Part1;

public class EmployeeSalary {
    int id;
    String name;
    double basicsal;
    public EmployeeSalary(int id, String name, double basicsal){
        this.id = id;
        this.name = name;
        this.basicsal = basicsal;
    }
    public double calculateHRA(){
        return basicsal*20/100;
    }
    public double calculateDA(){
        return basicsal*10/100;
    }
    public double calculateTotalsal(){
       return basicsal+calculateHRA()+calculateDA();
    }
    public void TotalList(){
        System.out.println("Emp ID:"+id);
        System.out.println("Emp name:"+name);
        System.out.println("BasicSal:"+basicsal);
        System.out.println("HRA(20%)"+calculateHRA());
        System.out.println("DA(10%):"+calculateDA());
        System.out.println("-----------------------");
        System.out.println("Total Sal:"+calculateTotalsal());
    }
}

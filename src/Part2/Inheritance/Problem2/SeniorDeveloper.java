package Part2.Inheritance.Problem2;

public class SeniorDeveloper extends Developer{
    int yrOfExperience;
    int teamSize;
    public SeniorDeveloper(String name, int empId, double sal,String programmingLanguage,int yrOfExperience, int teamSize){
        super(name,empId,sal,programmingLanguage);
        this.yrOfExperience=yrOfExperience;
        this.teamSize=teamSize;
    }
    public void displaySeniorDevDetails(){
        System.out.println("---------Senior Developer Details--------");
        System.out.println("Yr of EXP:"+yrOfExperience);
        System.out.println("Team Size:"+teamSize);
    }
}

package Part1;

public class StudentResult {
    String name;
    int rollno;
    int[] marks;
    public StudentResult(String name, int rollno, int[] marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public int calculateTotal(){
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total = total+marks[i];
        }
        return total;
    }
    public double calculatePercentage(){
        double percentage = calculateTotal()/5.0;
        return percentage;
    }
    public String calculateGrade(){
        double percentage = calculatePercentage();
        if(percentage >= 90){
            return "A+";
        } else if (percentage >= 80){
            return "A";
        } else if (percentage >= 70){
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }
    public void displayResult(){
        System.out.println("______Result______");
        System.out.println("Student Name:"+name);
        System.out.println("RollNum:"+rollno);
        System.out.println("Subject Marks");
        for(int i=0; i<marks.length; i++){
            System.out.println("Subject "+(i+1)+": "+marks[i]);
        }
        System.out.println("Total marks:"+calculateTotal());
        System.out.println("Pecentage:"+calculatePercentage()+"%");
        System.out.println("Grade:"+calculateGrade());
    }
}

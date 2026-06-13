import java.util.ArrayList;
import java.util.List;

public class Student {

    //Data members for each student to store name and grades
    private String name;
    private List<Double> grades;

    //Constructor to initialize the data members
    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    //method to add grades
    public void addGrade(Double grade){
        grades.add(grade);
    }

    //getter of name
    public String getName(){
        return name;
    }

    //getter of grades
    public List<Double> getGrades(){
        return grades;
    }

    //method to calculate average of grades
    public double calculateAverageOfGrades(){
        //checks if there are any grades or not; if not returns 0 else calculates the avg.
        if (grades.isEmpty()){
            return 0;
        }
        double sum=0;
        for (Double grade:grades){
            sum += grade;
        }
        return sum/grades.size();
    }

}
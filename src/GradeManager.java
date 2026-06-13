import java.util.HashMap;

public class GradeManager {

    public HashMap<String, Student> studentManager;

    //constructor
    public GradeManager(){
        studentManager = new HashMap<>();
    }

    //adding a student if it dosen't exist
    public void addStudent(String name){
        if (studentManager.containsKey(name)){
            System.out.println(name +" student already exists!");
            return;
        }
        studentManager.put(name, new Student(name));
    }

    //adding a grade
    public void addGrade(String name, double grade){
        Student student = getStudent(name);
        if (student == null){
            System.out.println(name+" student not found!");
            return;
        }
        student.addGrade(grade);
    }

    //adding a getStudent()
    public Student getStudent(String name){
        return studentManager.get(name);
    }

    //printing all average with name
    public void listAll(){
        for (Student s: studentManager.values()){
            System.out.println("Name: "+s.getName()+"\n\tAverage: "+s.calculateAverageOfGrades());
        }
    }
}

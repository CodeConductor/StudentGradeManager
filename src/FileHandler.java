import java.io.*;
import java.util.List;


public class FileHandler {
    File file = new File("studentData.txt");
//    //checks if file exists or not
//    private void checkFile() throws IOException{
//        if (!file.exists()){
//            System.out.println("File created: "+file.createNewFile());
//        }
//    }
//
//    //checks file is readable and writable or not
//    private boolean checkFilePermission(){
//        return file.canRead() && file.canWrite();
//    }

    //adds student to the file
    public void save(GradeManager gm) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("studentData.txt"))) {
            for (Student s : gm.studentManager.values()) {
                bw.write(s.getName());
                for (Double g : s.getGrades()) {
                    bw.write("," + g);
                }
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //loads the saved data
    public void load(GradeManager gm){
        try(BufferedReader br = new BufferedReader(new FileReader("studentData.txt"))){
            String line, name;
            double grade;
            while ((line = br.readLine()) != null) {
                String[] splittedStudentData = line.split(",");
                name = splittedStudentData[0];
                gm.addStudent(name);
                for (int i = 1; i < splittedStudentData.length; i++) {
                    grade = Double.parseDouble(splittedStudentData[i]);
                    gm.addGrade(name, grade);
                }
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}



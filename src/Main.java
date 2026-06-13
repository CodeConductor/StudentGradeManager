import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GradeManager gm = new GradeManager();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        FileHandler fh = new FileHandler();
        //loads data
        fh.load(gm);

        while (loop){
            System.out.println("---- Student Grade Manager ----");
            System.out.println("1. Add student\n2. Add grade\n3. View all students\n4. Exit\nChoose an option:");
            int choice = sc.nextInt();
            sc.nextLine(); //to clear buffer space created by nextInt()
            switch(choice){
                case 1 -> {
                    System.out.println("Enter student name:");
                    String name = sc.nextLine().toLowerCase();
                    gm.addStudent(name);
                }
                case 2 -> {
                    System.out.println("Enter student name:");
                    String name = sc.nextLine().toLowerCase();
                    System.out.println("Enter the grades:");
                    double grade = sc.nextDouble();
                    gm.addGrade(name, grade);
                }
                case 3 -> {
                    System.out.println("Listing all Students with average grades.");
                    gm.listAll();
                }
                case 4 -> {
                    loop = false;
                }
                default -> System.out.println("Please choose a valid option from 1 to 4.");
            }
        }
        //saves the data
        fh.save(gm);

    }
}
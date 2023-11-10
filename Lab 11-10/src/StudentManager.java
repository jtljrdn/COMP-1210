import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // Add Student to List
    public static ArrayList<String> addStudent(String student, ArrayList<String> students) {
        students.add(student);
        return students;
    }

    // Print List
    public static void printList(ArrayList<String> students){
        System.out.println("Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("");
    }

    // Main Function
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();

        // While Loop to Keep Running Until Exit Is Called

        boolean exit = false;
        while (exit == false) {
            System.out.print("""
                    Student Manager Menu:
                    1. Add Student
                    2. Display Student List
                    3. Exit
                    Enter your choice:""");
            System.out.print(" ");
            // Take User Input
            Scanner scnr = new Scanner(System.in);
            int userInput = scnr.nextInt();
            // Compare Input to Options
            if (userInput == 1) {
                System.out.print("Enter the student's name: ");
                String studentName = scnr.next();
                addStudent(studentName, Students);
                System.out.printf("%s has been added to the student list.\n\n", studentName);
            } else if (userInput == 2) {
                printList(Students);
            } else if (userInput == 3) {
                System.out.println("Exiting Student Manager. Goodbye!");
                exit = true;
            } else {
                System.out.println("Invalid Input, Please Choose From the List.");
            }
        }
    }
}

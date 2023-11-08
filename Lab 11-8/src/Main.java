import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create student and set values
        Student student = new Student();
        double[] studentScores = {90.5, 85.0, 78.5, 92.0, 88.5};
        student.setName("John Smith");
        student.setScores(studentScores);

        // Retrieve values and print details
        System.out.printf("""
                Student Name: %s
                Student Scores: %s
                %s's Average Score: %.1f
                """, student.getName(), Arrays.toString(student.getScores()), student.getName(), student.calculateAverageScore());
    }
}
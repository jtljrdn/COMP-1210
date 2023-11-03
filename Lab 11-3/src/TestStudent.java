public class TestStudent {
    public static void main(String[] args){
        // Create student objects
        Student student1 = new Student("John", "Doe", 1432, "john.doe@example.com", "Computer Science");
        Student student2 = new Student("Jeremy", "Elbertson", 985, "jeremy@gmail.com", "Film");
        Student student3 = new Student("Jordan", "Lee", 0071, "jtl0071@auburn.edu", "Software Engineering");

        // Output info on Student 1
        System.out.println("Student Information");
        System.out.println(student1.toString() + "\n");

        // Output info on Student 2
        System.out.println("Student Information");
        System.out.println(student2.toString() + "\n");

        // Output info on Student 3
        System.out.println("Student Information");
        System.out.println(student3.toString() + "\n");

        // Change Email of Student 2
        student2.setEmail("jeremy.elbertson@gmail.com");

        // Output updated info on Student 2
        System.out.println("Updated Student Information");
        System.out.println(student2.toString());
    }
}

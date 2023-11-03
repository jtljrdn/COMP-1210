public class Student {
    // Create params for Student class
    String firstName;
    String lastName;
    int studentId;
    String email;
    String major;
    // Default constructor
    public Student() {
        firstName = "";
        lastName = "";
        studentId = 0;
        email = "";
        major = "";
    }
    // Parameterized constructor
    public Student(String firstName, String lastName, int studentId, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.major = major;
    }

    // Accessor methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getEmail(){
        return email;
    }
    public String getMajor(){
        return major;
    }
    // Mutator method
    public void setEmail(String email){
        this.email = email;
    }
    // Stringify output
    public String toString(){
        return String.format("""
                Full Name: %s %s
                Student ID: %d
                Email: %s
                Major: %s""", getFirstName(), getLastName(), getStudentId(), getEmail(), getMajor());
    }



}

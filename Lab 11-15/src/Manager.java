public class Manager extends Employee {
    String department;

    // Mutator
    public void setDepartment(String department){
        this.department = department;
    }
    // Accessor
    public String getDepartment(){
        return department;
    }

    // Updated Details Method
    @Override
    public String getDetails(){
        return String.format("""
                Manager Details:
                Employee ID: %d
                Name: %s
                Department: %s
                """, employeeId, name, department);
    }
}

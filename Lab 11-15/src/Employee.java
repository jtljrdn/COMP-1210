public class Employee {
    // Vars
    String name;
    int employeeId;

    // Mutators
    public void setName(String name){
        this.name = name;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    // Details Method
    public String getDetails(){
        return String.format("""
                Employee ID: %d
                Name: %s
                """, employeeId, name);
    }
}

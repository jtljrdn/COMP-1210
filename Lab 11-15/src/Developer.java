public class Developer extends Employee{
    String programmingLanguage;

    // Mutator
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    // Accessor
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    // Updated Details Method
    @Override
    public String getDetails(){
        return String.format("""
                Developer Details:
                Employee ID: %d
                Name: %s
                Programming Language: %s
                """, employeeId, name, programmingLanguage);
    }
}

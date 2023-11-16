public class Employees {
    public static void main(String[] args){
        // Initialize instances
        Developer developer = new Developer();
        Manager manager = new Manager();

        // Set Manager Details and Print
        manager.setName("John Doe");
        manager.setEmployeeId(101);
        manager.setDepartment("Sales");
        System.out.println(manager.getDetails());

        // Set Developer Details and Print
        developer.setName("Alice Smith");
        developer.setEmployeeId(202);
        developer.setProgrammingLanguage("Java");
        System.out.println(developer.getDetails());
    }
}

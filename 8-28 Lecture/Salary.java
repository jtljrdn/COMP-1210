import java.util.Scanner;
public class Salary {
    public static void main (String [] args){
        int wage;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input wages: ");
        wage = scnr.nextInt();
        System.out.print("Salary is: $");
        System.out.println(wage * 40 * 52);
    }
}

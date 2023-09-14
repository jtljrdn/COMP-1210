import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;

        isLeapYear = false;
        inputYear = scnr.nextInt();

        if ((inputYear % 4) == 0) {
            isLeapYear = true;
            if ((inputYear % 10) == 0) {
                if (inputYear % 400 != 0) {
                    isLeapYear = false;
                }
            }
        }
        if (isLeapYear) {
            System.out.println(inputYear + " - leap year");
        } else {
            System.out.println((inputYear + " - not a leap year"));
        }
    }
}

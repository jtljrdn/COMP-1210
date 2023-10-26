import java.util.Scanner;

public class LabProgram2 {

    public static int daysInFeb(int userYear){

        boolean isLeapYear = false;
        if (userYear % 4 == 0){
            isLeapYear = true;
            if (userYear % 10 == 0){
                if (userYear % 400 != 0){
                    isLeapYear = false;
                }
            }
        }
        if (isLeapYear){
            return 29;
        }
        return 28;

    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userYear = scnr.nextInt();

        System.out.printf("%d has %d days in February.\n", userYear, daysInFeb(userYear));
    }
}

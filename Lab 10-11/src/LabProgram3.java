import java.util.Scanner;

public class LabProgram3 {

    public static double lapsToMiles(double userLaps){
        return userLaps * 0.25;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userValue = scnr.nextDouble();

        System.out.printf("%.2f",lapsToMiles(userValue));
    }
}

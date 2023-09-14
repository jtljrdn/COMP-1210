import java.util.Scanner;
import java.lang.Math;

public class LabProgram4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double dubOne = scnr.nextDouble();
        double dubTwo = scnr.nextDouble();
        double epsilon = scnr.nextDouble();

        if (Math.abs(dubOne - dubTwo) < 0.001 ){
            System.out.println("equal");
        } else if (((Math.abs(dubOne - dubTwo) <= epsilon))) {
            System.out.println("close enough");
        } else {
            System.out.println("not close");
        }
    }
}
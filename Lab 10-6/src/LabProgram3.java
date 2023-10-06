import java.util.Scanner;

public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt();
        int[] userValues = new int[numValues];   // List of integers from input
        int temp;

        // Take inputs
        for (int i = 0; i < userValues.length; i++) {
            userValues[i] = scnr.nextInt();
        }
        // Swap first and last values
        temp = userValues[0];
        userValues[0] = userValues[userValues.length - 1];
        userValues[userValues.length - 1] = temp;
        // Output list as string of numbers
        for (int i = 0; i < userValues.length; i++) {
            System.out.print(userValues[i] + " ");
        }
        System.out.println("");
    }
}
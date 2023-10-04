import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        numElements = scnr.nextInt();   // Input begins with number of integers that follow
        int[] reversedList = new int[numElements];

        // Take input
        for (int i = 0; i < numElements; i++) {
            userList[i] = scnr.nextInt();
        }

        // Print and Reverse Array
        for (int i = numElements-1; i >= 0; i--) {
            System.out.print(userList[i] + ",");
        }
        // End with newline
        System.out.println("");
    }
}

import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt();
        int[] userValues = new int[numValues];   // List of integers from input
        boolean isPalindrome = false;

        // Take inputs
        for (int i = 0; i < userValues.length; i++) {
            userValues[i] = scnr.nextInt();
        }
        // Check if palindrome
        for (int i = 0; i < userValues.length; i++) {
            if (userValues[i] != userValues[userValues.length - i - 1]){
                break;
            } else {
                isPalindrome = true;
            }
        }
        // Print result
        if (isPalindrome){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
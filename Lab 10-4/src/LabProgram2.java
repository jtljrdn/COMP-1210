import java.util.Arrays;
import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[12];  // Set of data specified by the user
        int numElements = 0;

        // Take input
        for (int i = 0; i < userValues.length; i++) {
            numElements++;
            userValues[i] = scnr.nextInt();
            if (userValues[i] < 0){
                break;
            }
        }
        // Create new array at length of old array not including zeros
        int[] newArray = new int[numElements - 1];
        for (int i = 0; i < userValues.length; i++) {
            if (userValues[i] > 0){
                newArray[i] = userValues[i];
            }
        }
        // Print middle num if length is less than or equal to 9
        if (newArray.length > 9){
            System.out.println("Too many numbers");
        } else {
            System.out.println("Middle item: " + newArray[newArray.length / 2]);
        }
    }
}

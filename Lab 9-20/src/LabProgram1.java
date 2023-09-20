import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;

        // Take input
        userInput = scnr.nextInt();

        // Convert input to binary
        while (userInput > 0){
            System.out.print(userInput % 2);
            userInput = userInput / 2;
        }
        System.out.println("");
    }
}

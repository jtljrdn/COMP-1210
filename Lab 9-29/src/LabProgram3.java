import java.util.Scanner;

public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput1 = scnr.nextInt();
        int userInput2 = scnr.nextInt();

        if (userInput1 > userInput2) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            System.out.print(userInput1 + " ");
            while (userInput1 < userInput2) {
                userInput1 += 5;
                if (userInput1 <= userInput2) {
                    System.out.print(userInput1 + " ");
                }
            }
            System.out.println();
        }
    }
}

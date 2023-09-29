import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = scnr.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isLetter(userInput.charAt(i))) {
                System.out.print(userInput.charAt(i));
            }
        }
        System.out.println("");
    }
}

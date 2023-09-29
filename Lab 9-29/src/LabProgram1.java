import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String comparisonChar = scnr.next();
        String userInput = scnr.nextLine();
        int count = 0;

        for (int i = 0; i < userInput.length(); i++) {
            String index = String.valueOf(userInput.charAt(i));
            if (comparisonChar.equals(index)){
                count++;
            }
        }

        if (count != 1){
            System.out.println(count + " " + comparisonChar + "'s");
        } else {
            System.out.println(count + " " + comparisonChar);
        }
    }
}
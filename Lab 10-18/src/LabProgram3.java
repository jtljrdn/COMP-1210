import java.util.Scanner;

public class LabProgram3 {

    public static int calcNumCharacters(String userString, char userChar){
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userChar == userString.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString = scnr.nextLine();
        char userChar = userString.charAt(0);
        userString = userString.substring(1);
        int num = calcNumCharacters(userString, userChar);
        if (num != 1){
            System.out.printf("%d %c's\n", num, userChar);
        } else {
            System.out.printf("%d %c\n", num, userChar);
        }
    }
}

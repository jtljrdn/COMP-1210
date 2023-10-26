import java.util.Scanner;

public class LabProgram1 {

    public static int fibonacci(int index){
        int num1;
        int num2 = 1;
        int output = 0;
        if (index < 0) {
            return -1;
        }
        for (int i = 0; i < index; i++) {
            num1 = num2;
            num2 = output;
            output = num1 + num2;
        }
        return output;
        }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        System.out.printf("fibonacci(%d) is %d\n", userInput, fibonacci(userInput));
    }
}

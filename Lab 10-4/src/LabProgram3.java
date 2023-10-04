import java.util.Scanner;

public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInputs = scnr.nextInt();
        float[] userInput = new float[numInputs];
        float normalNum;
        float maxNum = 0;

        // Take input
        for (int i = 0; i < numInputs; i++) {
            userInput[i] = scnr.nextFloat();
        }
        // Find max num
        for (int i = 1; i < numInputs; i++) {
            maxNum = userInput[i - 1];
            if (userInput[i] > userInput[i - 1]){
                maxNum = userInput[i];
            }
        }
        for (int i = 0; i < numInputs; i++) {
            normalNum = userInput[i] / maxNum;
            System.out.printf("%.2f ", normalNum);
        }
        System.out.println("");
    }
}

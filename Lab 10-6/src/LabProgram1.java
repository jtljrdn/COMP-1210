import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Declare variables
        int numInputs = scnr.nextInt();
        int[] inputList = new int[numInputs];
        int firstSmallestNum;
        int secondSmallestNum;

        // Take input
        for (int i = 0; i < inputList.length; i++) {
            inputList[i] = scnr.nextInt();
        }
        firstSmallestNum = inputList[0];
        secondSmallestNum = inputList[1];

        // Iterate through array to find firstSmallestNum
        for (int i = 1; i < inputList.length; i++) {
            if (inputList[i] < firstSmallestNum){
                firstSmallestNum = inputList[i];
            }
        }
        // Iterate through array to find secondSmallestNum
        for (int i = 0; i < inputList.length; i++) {
            if ((inputList[i] < secondSmallestNum) && (inputList[i] > firstSmallestNum)) {
                secondSmallestNum = inputList[i];
            }
        }
        System.out.println(firstSmallestNum + " and " + secondSmallestNum);
    }
}

import java.util.Scanner;

public class LabProgram1 {

    public static void sortArray(int[] myArr, int arrSize){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arrSize - 1; i++) {
            swapped = false;
            for (j = 0; j < arrSize - i - 1; j++) {
                if (myArr[j] < myArr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = myArr[j+1];
                    myArr[j+1] = myArr[j];
                    myArr[j] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int[] userValues = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            userValues[i] = scnr.nextInt();
        }
        sortArray(userValues, arrSize);
        for (int i = 0; i < userValues.length; i++) {
            System.out.print(userValues[i] + ",");
        }
        System.out.println("");
    }
}

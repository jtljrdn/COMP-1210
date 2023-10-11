import java.util.Scanner;

public class LabProgram1 {

    public static int[] swapValues(int[] array){
        int temp1;
        int temp2;

        temp1 = array[0];
        array[0] = array[1];
        array[1] = temp1;

        temp2 = array[2];
        array[2] = array[3];
        array[3] = temp2;

        return array;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[4];
        int[] newArray = new int[4];
        for (int i = 0; i < userValues.length; i++) {
            userValues[i] = scnr.nextInt();
        }
        newArray = swapValues(userValues);
        for (int i = 0; i < userValues.length; i++) {
            if (i != userValues.length - 1) {
                System.out.print(newArray[i] + " ");
            } else {
                System.out.print(newArray[i]);
            }
        }
        System.out.println("");
    }
}

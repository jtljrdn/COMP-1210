import java.util.Scanner;

public class LabProgram2 {

    public static int maxNumber(int num1, int num2, int num3, int num4){
        int[] arr = new int[4];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        arr[3] = num4;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static int minNumber(int num1, int num2, int num3, int num4){
        int[] arr = new int[4];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        arr[3] = num4;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        int num4 = scnr.nextInt();
        System.out.printf("Maximum is %d\n", maxNumber(num1, num2, num3, num4));
        System.out.printf("Minimum is %d\n", minNumber(num1, num2, num3, num4));
    }
}

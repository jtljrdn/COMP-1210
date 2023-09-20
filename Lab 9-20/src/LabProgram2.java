import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();
        int sum = 0;
        int numNumbers = 0;
        int maxNum = 0;
        double average = 0;

        while (userNum > -1){
            sum = userNum + sum;
            numNumbers++;
            if (userNum > maxNum){
                maxNum = userNum;
            }
            userNum = scnr.nextInt();
        }

        average = (double) (sum) / numNumbers;
        System.out.print(maxNum);
        System.out.printf(" %.2f\n", average);
    }
}

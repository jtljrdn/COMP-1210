import java.util.Scanner;

public class LabProgram {

    public static int countEvens(int num1, int num2, int num3, int num4){
        int count = 0;
        if (num1 % 2 == 0){
            count++;
        }
        if (num2 % 2 == 0){
            count++;
        }
        if (num3 % 2 == 0){
            count++;
        }
        if (num4 % 2 == 0){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        int result = countEvens(num1, num2, num3, num4);
        System.out.println("Total evens: " + result);
    }
}

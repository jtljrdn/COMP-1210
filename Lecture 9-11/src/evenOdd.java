import java.util.Scanner;

public class evenOdd {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scnr.nextInt();

        if (num % 2 == 0){
            System.out.println("Num is even");
        }
        else {
            System.out.println("Num is odd");
        }
    }
}

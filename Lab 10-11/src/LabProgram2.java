import java.util.Scanner;
import java.util.Random;

public class LabProgram2 {
    public static String coinFlip(Random rand){
      int num = rand.nextInt(2);
      if (num == 1){
          return "Heads";
      } else {
          return "Tails";
      }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Unique seed

        int coinFlipNum = scnr.nextInt();

        for (int i = 0; i < coinFlipNum; i++) {
            System.out.println(coinFlip(rand));
        }
    }
}

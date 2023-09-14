import java.util.Scanner;

public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numPar = scnr.nextInt();
        int numStrokes = scnr.nextInt();
        String output = "";

        if (!((numStrokes <= 1 || numStrokes > 6) || (numPar <= 1 || numPar > 6))){
            if (numStrokes - numPar == -2) {
                output = "Eagle";
            } else if (numStrokes - numPar == -1) {
                output = "Birdie";
            } else if (numStrokes - numPar == 0) {
                output = "Par";
            } else if (numStrokes - numPar > 0) {
                output = "Bogey";
            }
        } else {
            output = "Error";
        }

        System.out.println(output);
    }
}

import java.util.Scanner;
/*
Golf scores record the number of strokes used to get the ball in the hole.
The expected number of strokes varies from hole to hole and is called par (i.e. 3, 4, or 5).
Each score's name is based on the actual strokes taken compared to par:

"Eagle": number of strokes is two less than par
"Birdie": number of strokes is one less than par
"Par": number of strokes equals par
"Bogey": number of strokes is one more than par
Given two integers that represent par and the number of strokes used, write a program that prints the appropriate score name.
Print "Error" if par or score is not in the expected range.
 */
public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numPar = scnr.nextInt();
        int numStrokes = scnr.nextInt();
        String output = "";

        if (!((numStrokes <= 1 || numStrokes > 5) || (numPar <= 1 || numPar > 5))){
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

import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth = scnr.next();
        int inputDay = scnr.nextInt();
        String output = "Invalid";

        if (!((inputDay > 0) && (inputDay <= 31))){
            output = "Invalid";
        } else {
            if ((inputMonth.equals("March") || inputMonth.equals("April") || inputMonth.equals("May") || inputMonth.equals("June"))){
                if ((inputMonth.equals("March"))){
                    if (inputDay < 20){
                        output = "Winter";
                    } else {
                        output = "Spring";
                    }
                } else if ((inputMonth.equals("April")) || inputMonth.equals("May")) {
                    output = "Spring";
                } else {
                    if (inputDay <= 20){
                        output = "Spring";
                    } else {
                        output = "Summer";
                    }
                }
            }
            if ((inputMonth.equals("July") || inputMonth.equals("August") || inputMonth.equals("September"))){
                if ((inputMonth.equals("July") || inputMonth.equals("August"))){
                    output = "Summer";
                } else {
                    if (inputDay <= 21){
                        output = "Summer";
                    } else if (inputDay > 30){
                        output = "Invalid";
                    }
                    else {
                        output = "Autumn";
                    }
                }
            }
            if (((inputMonth.equals("October") || inputMonth.equals("November") || inputMonth.equals("December")))){
                if ((inputMonth.equals("October") || inputMonth.equals("November"))){
                    output = "Autumn";
                } else {
                    if (inputDay <= 20){
                        output = "Autumn";
                    } else {
                        output = "Winter";
                    }
                }
            }
            if (((inputMonth.equals("January") || inputMonth.equals("February")))){
                output = "Winter";
            }
        }

        System.out.println(output);
    }
}

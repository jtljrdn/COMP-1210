import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalPennies = scnr.nextInt();
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        if (totalPennies == 0) {
            System.out.println("No change");
        } else if (totalPennies >= 5) {
            if (totalPennies >= 10) {
                if (totalPennies >= 25) {
                    if (totalPennies >= 100) {
                        dollars = totalPennies / 100;
                        totalPennies -= dollars * 100;
                    }
                    quarters = totalPennies / 25;
                    totalPennies -= quarters * 25;
                }
                dimes = totalPennies / 10;
                totalPennies -= dimes * 10;
            }
            nickels = totalPennies / 5;
            totalPennies -= nickels * 5;
        }
        if (dollars != 0) {
            if (dollars > 1) {
                System.out.println(dollars + " Dollars");
            } else {
                System.out.println(dollars + " Dollar");
            }
        }
        if (quarters != 0) {
            if (quarters > 1) {
                System.out.println(quarters + " Quarters");
            } else {
                System.out.println(quarters + " Quarter");
            }
        }
        if (dimes != 0) {
            if (dimes > 1) {
                System.out.println(dimes + " Dimes");
            } else {
                System.out.println(dimes + " Dime");
            }
        }
        if (nickels != 0) {
            if (nickels > 1) {
                System.out.println(nickels + " Nickels");
            } else {
                System.out.println(nickels + " Nickel");
            }
        }
        if (totalPennies != 0) {
            if (totalPennies > 1) {
                System.out.println(totalPennies + " Pennies");
            } else {
                System.out.println(totalPennies + " Penny");
            }
        }

    }
}

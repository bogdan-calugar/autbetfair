package homeworks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year between 1900-2016: ");
            int num = scan.nextInt();
            int divisibleByFour = num % 100;
            if (num >= 1900 && num <= 2016) {
                if ((divisibleByFour % 4 == 0 && num % 100 != 0) || (num % 100 == 0 && num % 400 != 0)) {
                    System.out.println("Month of February has 29 days.");
                } else {
                    System.out.println("Month of February has 28 days.");
                }
                scan.close();
                break;
            } else {
                System.out.println("You didn't enter a number between 1900-2016. Please try again.");
            }
        }
    }
}

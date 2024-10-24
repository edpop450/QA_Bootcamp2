package LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1900 and 2016: ");
        int year = scanner.nextInt();

        if (year >= 1900 && year <= 2016) {
            int daysInFebruary = getDaysInFebruary(year);
            System.out.println("February in " + year + " has " + daysInFebruary + " days.");
        } else {
            System.out.println("Year is out of the valid range (1900-2016).");
        }

        scanner.close();
    }

    public static int getDaysInFebruary(int year) {
        if (isLeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}

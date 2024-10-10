import java.util.Scanner;
public class Hello {

//    public static void main(String[] args) {
//
//        int myFirstVariable = 100;
//        int mySecondVariable;
//        final int MAX_SIZE = 10;
//        final double PI = Math.PI;
//
//        System.out.println("Hello world !");
//
//        System.out.println("Second variable value is " + myFirstVariable);
//
//        // MAX_SIZE = MAX_SIZE + 1;
//        System.out.println(args[0] + args[1]);
//
//        int operandLeft = Integer.parseInt(args[0]);
//        int operandRight = Integer.parseInt(args[1]);
//
//        System.out.println(operandLeft + operandRight);
//
//        String currentDay = "Monday";
//
//        switch (currentDay) {
//            case "Monday": {
//                System.out.println("Nope");
//                break;
//            }
//            case "Friday": {
//                System.out.println("Yay");
//                break;
//            }
//            default: {
//                System.out.println("meh");
//            }
//        }
//
//        int currentNumber = 1;
//        while (currentNumber <= MAX_SIZE){
//            System.out.println("Current number is " + currentNumber);
//            currentNumber ++;
//        }
//        currentNumber = 1;
//        do{
//            System.out.println("Current number is " + currentNumber);
//            currentNumber ++;
//        }
//        while(currentNumber <= MAX_SIZE);
//
//        for (int i = 0; i <= MAX_SIZE; i++) {
//            System.out.println("Current number is " + i);
//        }
//        for (String arg : args){
//            System.out.println(arg);
//        }
//
//        for (int i = 2; i <= 10000; i++) {
//            boolean isPrime = true;
//            for(int j=2; j<= i/2; j++){
//                if (i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println("Number "+ i +" is prime.");
//            }
//        }
//
//    }

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

package SwitchStatement6;

import java.util.Scanner;

public class EnhancedSwitchB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int num = inp.nextInt();

        //        Enhanced switch statements when break condition is used in every case
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid day number!");
        }

        //    When break condition is not used
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid day number!");
        }
    }
}
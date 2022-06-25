package assignments.First1;

import java.util.Scanner;

public class Q2greeting {
    public static void main(String[] args) {
        // 2. Take name as input and print a greeting message for that name.
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hey " + name + ", nice to meet you!");
    }
}

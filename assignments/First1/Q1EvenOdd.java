package assignments.First1;

import java.util.Scanner;

public class Q1EvenOdd {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input.
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
       }
    }
}

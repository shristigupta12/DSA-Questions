package assignments.Methods2;

import java.util.Scanner;

public class Q7Factorial {
    
/*    Q.7.  Write a program to print the factorial of a number by defining a method     named factorial*/
public static void main(String[] args) {
    
    System.out.print("Enter a number : ");
    Scanner inp = new Scanner(System.in);
    int num = inp.nextInt();
    System.out.println("The factorial of "+num+" is "+factorial(num));
    }
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

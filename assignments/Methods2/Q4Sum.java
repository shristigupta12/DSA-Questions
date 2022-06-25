package assignments.Methods2;

import java.util.Scanner;

public class Q4Sum {
    public static void main(String[] args) {
/*       Q.4. Write a program to print the sum of two numbers entered by user by defining your own method*/
        System.out.println("Enter two numbers : ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("The sum of a and b is "+ sum(a,b));
    }
    static int sum(int a, int b){
        return a+b;
    }
}

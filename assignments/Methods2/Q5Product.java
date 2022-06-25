package assignments.Methods2;

import java.util.Scanner;

public class Q5Product {
    //Q5.  Define a method that returns the product of two numbers entered by user
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("The product is "+ product(a, b));
    }
    static int product(int a, int b){
        return a*b;
        }  
}

package assignments.First1;

import java.util.Scanner;

public class Q3operations {
    public static void main(String[] args) {
        // 3. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = inp.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = inp.nextInt();
        System.out.print("Enter the operation you want to perform between these two numbers: ");
        char o = inp.next().charAt(0);

        if (o=='+'){
            System.out.println("The output is: " + (n1+n2));
        }
        else if(o=='-'){
            System.out.println("The output is: " + (n1-n2));
        }
        else if(o=='*'){
            System.out.println("The output is: " + (n1*n2));
        }
        else if(o=='/'){
            System.out.println("The output is: " + (n1/n2));
        }
    }
}

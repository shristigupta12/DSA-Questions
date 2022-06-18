package ClassQ;

import java.util.Scanner;

public class ArithematicOp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = inp.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = inp.nextInt();
        System.out.print("Enter the operation you want to perform between these two numbers: ");
        char o = inp.next().charAt(0);

        switch (o){
            case '+' -> System.out.println("The output is: " + (n1+n2));
            case '-' -> System.out.println("The output is: " + (n1-n2));
            case '*' -> System.out.println("The output is: " + (n1*n2));
            case '/'-> System.out.println("The output is: " + (n1/n2));
            default -> System.out.println("Enter a valid operation!");
        }
    }
}

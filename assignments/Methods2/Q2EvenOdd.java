package assignments.Methods2;

import java.util.Scanner;

public class Q2EvenOdd {
    public static void main(String[] args) {
        // Q.2. Define a program to find out whether a given number is even or odd
         System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(evenOdd(num)){
            System.out.println(num + " is even");
        }
        else
            System.out.println(num + " is odd" );
    }
    static boolean evenOdd(int num){
        if (num%2==0){
            return true;
        }
        else{
            return false;
        }
}
}

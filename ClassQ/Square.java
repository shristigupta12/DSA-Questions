package ClassQ;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        System.out.println("The square of "+num+" is: "+num*num);
    }
}

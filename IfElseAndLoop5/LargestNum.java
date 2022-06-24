package IfElseAndLoop5;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max + " is the greatest number");
    }
}

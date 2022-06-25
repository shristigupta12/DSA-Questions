package assignments.Methods2;

import java.util.Scanner;

public class Q1MaxMinNum {
    public static void main(String[] args) {
        // Q.1. Define two methods to print the maximum and the minimum number respectively among three
//        numbers entered by the user.
//        method 1:
          Scanner inp = new Scanner(System.in);
        System.out.println("Enter three numbers to find the max : ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        System.out.println("Maximum number is " + maxNum(a, b, c));
//    method 2 : Don't know yet

    }
    static int maxNum(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
}

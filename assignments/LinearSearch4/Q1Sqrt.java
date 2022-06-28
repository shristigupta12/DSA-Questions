package assignments.LinearSearch4;

import java.util.Scanner;

public class Q1Sqrt {
/*Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.*/
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int num = inp.nextInt();
    System.out.println(ans(num));
}
public static int ans(int num){
    int i=0;
    while(i*i<=num){
        if(i*i==num){
            return i;
        }
        i++;
    }
    return i-1;
}
}

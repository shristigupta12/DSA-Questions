package IfElseAndLoop5;

import java.util.Scanner;
public class OccurenceOfDigit {
    public static void OccurenceOfDigitFunc() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = inp.nextLong();
        System.out.print("Enter the digit the occurence of which you want to count: ");
        int digit = inp.nextInt();
        int count = 0;
        while(num!=0){
            long rem = num%10;
            num/=10;
            if (rem==digit){
                count++;
            }
        }
        System.out.println(count);
    }
}

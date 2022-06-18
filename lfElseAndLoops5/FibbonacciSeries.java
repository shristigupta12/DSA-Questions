package lfElseAndLoops5;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter which fibonacci number you want to find: ");
        int n = inp.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if (n==1){
            System.out.println(0);
        }else{
            while(n>count){
                int temp = b;
                b=b+a;
                a = temp;
                count++;
            }
            System.out.println(b);
        }
    }
}

package assignments.Methods2;

import java.util.Scanner;

public class Q8Palindrome {
    public static void main(String[] args) {
        //     Q.8. Write a program to find whether a number is palindrome or not
        System.out.print("Enter a number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (palindromeCheck(num)) {
            System.out.println(num+" is a palindrome");                       /*DOUBT */ 
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
    static boolean palindromeCheck ( int n){                        /*-----------DOUBT*/
        int arry[] = new int[30];
        int count = 0;
        while (n > 0) {
            arry[count] = n % 10;
            n /= 10;
            count++;
        }
        int i = count;
        while (i >= count / 2) {
            if (arry[i] != arry[count - i]) {
                return false;
            }
            i--;
        }
        return true;
    }
}

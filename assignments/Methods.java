package assignments;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Methods {


    public static void main(String[] args) {
//        Q.1. Define two methods to print the maximum and the minimum number respectively among three
//        numbers entered by the user.
//        method 1:
          /*Scanner inp = new Scanner(System.in);
        System.out.println("Enter three numbers to find the max : ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        System.out.println("Maximum number is " + maxNum(a, b, c));*/
//    method 2 : Don't know yet

//        Q.2. Define a program to find out whether a given number is even or odd
        /* System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(evenOdd(num)){
            System.out.println(num + " is even");
        }
        else
            System.out.println(num + " is odd" );*/

//        Q.3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out
//        if he/she is eligible to vote
        /*System.out.print("Enter your age : ");
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        if (voteEligibility(age)){
            System.out.println("You are eligible to vote");
        }
        else System.out.println("You are not eligible to vote");*/

//        Q.4. Write a program to print the sum of two numbers entered by user by defining your own method
        /*System.out.println("Enter two numbers : ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("The sum of a and b is "+ sum(a,b));

//        Q.5. Define a method that returns the product of two numbers entered by user
        System.out.println("Enter two numbers : ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("The product is "+ product(a, b));*/

//        Q.6. Define a method to find out if a number is prime or not
        /*System.out.print("Enter a number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (primeCheck(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }*/

//    Q.7.  Write a program to print the factorial of a number by defining a method named factorial
        /*System.out.print("Enter a number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println("The factorial of "+num+" is "+factorial(num));*/

//     Q.8. Write a program to find whether a number is palindrome or not
       /* System.out.print("Enter a number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (palindromeCheck2(num)) {
            System.out.println(num+" is a palindrome");                        DOUBT
        }
        else{
            System.out.println(num+" is not a palindrome");
        }*/

//        Q.9. Write a program to check if a given triplet is pythagorean triplet or not
        /*System.out.println("Enter three numbers : ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a==maxNum(a, b, c)){
            if (pythagoreanCheck(a, b, c)){
                System.out.println("Yes these form a pythagorean triplet");
            }
            else{
                System.out.println("No these do not form a pythagorean triplet");
            }
        }
        if (b==maxNum(b, a, c)){
            if (pythagoreanCheck(a, b, c)){
                System.out.println("Yes these form a pythagorean triplet");
            }
            else{
                System.out.println("No these do not form a pythagorean triplet");
            }
        }
        if (c==maxNum(c, b, a)){
            if (pythagoreanCheck(a, b, c)){
                System.out.println("Yes these form a pythagorean triplet");
            }
            else{
                System.out.println("No these do not form a pythagorean triplet");
            }
        }*/

    }    // ====> don't comment this


      /*static int maxNum(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }*/

    /*static boolean evenOdd(int num){
        if (num%2==0){
            return true;
        }
        else{
            return false;
        }*/

    /*static boolean voteEligibility(int num){
        if (num>=18) return true;
        else return false;
    }*/

    /*static int sum(int a, int b){
        return a+b;
    }*/

    /*static int product(int a, int b){
        return a*b;
        }*/

    /*static boolean primeCheck(int num){
        int a = 2;
        while(a<num){
            if (num%a==0){
                return false;
            }
            a++;
        }
        return true;
    }*/

    /*static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);}*/


        /*static boolean palindromeCheck ( int n){                       ---------- DOUBT
            int count = 0;
            String s = String.valueOf(n);
            int l = s.length();
            while (count <= n / 2) {
                if (s.charAt(count) != s.charAt(l - count)) {
                    return false;
                }
                count++;
            }
            return true;
        }

        static boolean palindromeCheck2 ( int n){                        -----------DOUBT
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
        }*/
    /*static boolean pythagoreanCheck(int a, int b, int c){
        if ((a*a)==(b*b)+(c*c)){
            return true;
        }
        return false;
    }*/

    }


package assignments.Methods2;

import java.util.Scanner;

public class Q9PythagoreanTriplet {
    public static void main(String[] args) {
//      Q.9. Write a program to check if a given triplet is pythagorean triplet or not
        System.out.println("Enter three numbers : ");
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
        }
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
    static boolean pythagoreanCheck(int a, int b, int c){
        if ((a*a)==(b*b)+(c*c)){
            return true;
        }
        return false;
    }
}

package assignments.Methods2;

import java.util.Scanner;

public class Q6Prime {
    public static void main(String[] args) {
        //        Q.6. Define a method to find out if a number is prime or not
        System.out.print("Enter a number : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (primeCheck(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
    }
    static boolean primeCheck(int num){
        int a = 2;
        while(a<num){
            if (num%a==0){
                return false;
            }
            a++;
        }
        return true;
    }
}

package methods7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodA {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int sum = sumMet(a,b);
        System.out.println("The sum of "+a+"  and "+b+" is : "+sum);
    }
    static int sumMet(int a, int b){
        return a+b;
    }
}

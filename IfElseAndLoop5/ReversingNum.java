package IfElseAndLoop5;
import java.util.Scanner;

public class ReversingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        long ans=0;
        long temp = num;
        while(temp!=0){
            long rem = temp%10;
            ans = (ans*10) + rem;
            temp/=10;
        }
        System.out.println("The reverse of " +num+ " is "+ans);
    }
}

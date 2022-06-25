package assignments.Methods2;

import java.util.Scanner;

public class Q3VoteEligible {
    public static void main(String[] args) {
        /*Q.3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out
        if he/she is eligible to vote*/
        System.out.print("Enter your age : ");
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        if (voteEligibility(age)){
            System.out.println("You are eligible to vote");
        }
        else System.out.println("You are not eligible to vote");
    }
    static boolean voteEligibility(int num){
        if (num>=18) return true;
        else return false;
    }
}

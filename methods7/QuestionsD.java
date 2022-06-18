package methods7;

import java.util.Scanner;

public class QuestionsD {

    // 1. Checking whether a number is prime or not.
    /* public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not : ");
        int num = inp.nextInt();
        System.out.println(primecheck(num));
    }
    static boolean primecheck(int n){
        if (n<2){
            return false;
        }
        else{
            for (int i=2; i*i<=n; i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }*/

    // 2. Checking whether a number is Armstrong Number or not.
    /*public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Armstrong or not: ");
        int a = inp.nextInt();
        System.out.println(ArmsCheck(a));
    }
    static boolean ArmsCheck(int n){
        int original = n;
        int sum = 0;
        if (n<1){
            return false;
        }
        while (n>0){
            int rem = n%10;
            sum+= rem*rem*rem;
            n/= 10;
        }
        return sum==original;
    }*/

    // 3. Find out all the 3-digit Armstrong numbers.
    public static void main(String[] args) {
        System.out.print("All the 3-digit Armstrong number are : ");
        for (int i=100; i<1000;i++){
            if (ArmsCheck(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean ArmsCheck(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+= rem*rem*rem;
            n/=10;
        }
        return sum==original;
    }
}

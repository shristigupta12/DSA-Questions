package LinearSearch9;

import java.util.Scanner;

// Finding the number of elements in array which contain even number of digits.

public class EvenDigitQ {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        int ans = EvenDigitEl(arr);
        System.out.println("The number of even digit elements in array are "+ans);
    }
    static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i =0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
    static int EvenDigitEl(int[] arr){
        if (arr.length==0){
            System.out.println("Array is empty");
            return -1;
        }
        else{
        int count = 0;
        for (int a: arr){
            int num = a;
            int digitcount =0;
            while(num>0){
                num/=10;
                digitcount++;
            }
            if (digitcount%2==0){
                count++;
            }
        }
        return count;
        }
    }
}

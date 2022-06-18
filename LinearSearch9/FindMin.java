package LinearSearch9;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = inputArray();
        findMinNum(array);
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
    static void findMinNum(int[] arr){
        if (arr.length==0){
            System.out.println("Array is empty");
        }
        else {
            int min = arr[0];
            for (int a : arr) {
                if (a <= min) {
                    min = a;
                }
            }
            System.out.println("The minimum element of array is " + min);
        }
    }

}

package LinearSearch9;

import java.util.Scanner;

public class LinearSearchOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = inputArray();
        printArray(array);
        System.out.print("Enter the element you want to search in your array : ");
        int target = input.nextInt();
        int index = linearSearch(array, target);
        System.out.println("Index : "+index);
    } //***********

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

    static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static int linearSearch(int[] array, int target){
        if (array.length==0){
            System.out.println("Array is empty");
        }
        else{
            for (int i=0; i<array.length; i++){
                if (array[i]==target){
                    System.out.println("Element found!");
                    return i;
                }
            }
            System.out.println("Element not found in array!");
        }
        return -1;
    }

}

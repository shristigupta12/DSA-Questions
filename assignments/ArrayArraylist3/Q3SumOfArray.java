package assignments.ArrayArraylist3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3SumOfArray {
    public static void main(String[] args) {
        //       3. Running sum of 1d array
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of arrays : ");
        int size = inp.nextInt();
        int[] arr1 = new int[size];
        inputArray(arr1, size);
        int[] arr2 = new int[size];
        inputArray(arr2, size);
        System.out.println(Arrays.toString(sumOfArray(arr1, arr2)));
    }
    static void inputArray(int[] array, int size){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        int s = 0;
        while(s<size){
            array[s]= inp.nextInt();
            s++;
        }
    }
    static int[] sumOfArray(int[] a1, int[] a2){
        int[] newArr = new int[a1.length];
        for (int i=0; i<a1.length; i++){
            newArr[i] = a1[i] + a2[i];
        }
        return newArr;
    }
}

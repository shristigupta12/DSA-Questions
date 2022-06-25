package assignments.ArrayArraylist3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2Concatenation {
    public static void main(String[] args) {
        //       2. Concatenation of Array
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        displayArray(arr, size);
        int[] concatArr = Concat(arr, size);
        displayArray(concatArr, 2*size);
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
    static void displayArray(int[] array, int size){
        System.out.println(Arrays.toString(array));
    }
    static int[] Concat(int[] array, int size) {
        System.out.println("The concatenated array is : ");
        int s = 2 * size;
        int[] arr = new int[s];
        int t = 0;
        for (int a = 0; a < 2*size; a++) {
            arr[a]=array[t];
            t++;
            if (t==size){
                t=0;
            }
        }
        return arr;
    }
}

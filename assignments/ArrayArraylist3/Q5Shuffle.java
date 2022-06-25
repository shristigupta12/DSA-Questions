package assignments.ArrayArraylist3;

import java.util.Arrays;
import java.util.Scanner;

public class Q5Shuffle {
    public static void main(String[] args) {
        //       5. Shuffle the array in the order: if input = [a1, a2, a3, b1, b2, b3] then output should be [a1, b1, a2, b2, a3, b3]
        int[] sArray = new int[6];
        inputArray(sArray, 6);
        System.out.println(Arrays.toString(shuffleArray(sArray, 6)));
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
    static int[] shuffleArray(int[] arr, int size){
        int count = size/2;
        int[] newArray = new int[size] ;
        int j=0;
        for (int i=0; i<size; i+=2){
                newArray[i] = arr[j];
                newArray[i+1] = arr[count];
                count++;
                j++;
        }
        return newArray;
    }
}

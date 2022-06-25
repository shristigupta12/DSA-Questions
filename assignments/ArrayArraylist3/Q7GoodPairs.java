package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q7GoodPairs {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // 7. Number of good pairs
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        int count = 0;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (arr[j]==arr[i]){
                    count++;
                }
            }
        }
        System.out.println("Number of good pairs : "+count);
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
}

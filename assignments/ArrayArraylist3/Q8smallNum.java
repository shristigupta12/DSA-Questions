package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q8smallNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //       8. How many numbers are smaller than the current number
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        int[] ans = new int[size];
        for (int i=0; i<size; i++){
            int count = 0;
            for (int j=0; j<size; j++){
                if (arr[j]<arr[i]){
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
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

package assignments.ArrayArraylist3;
import java.util.Arrays;
import java.util.Scanner;

public class Q16EvenDigitNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//      16. Find numbers with even number of digits
        System.out.print("Enter the size of array : ");
        int s = inp.nextInt();
        int[] arr= new int[s];
        inputArray(arr, s);
        int ans = 0;
        for (int num : arr){
            int n = num; int count =0;
            while(n>0){
                n/=10;
                count++;
            }
            if (count%2==0){
                ans++;
            }
        }
        System.out.println("The number of elements with even number of digits are : "+ans);
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

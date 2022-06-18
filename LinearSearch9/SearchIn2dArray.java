package LinearSearch9;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = input2dArray();
        print2dArray(arr);
        System.out.print("Enter the element you want to search in the 2D array : ");
        int target = inp.nextInt();
        Search2d(arr, target);
    }
    static int[][] input2dArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of rows for array : ");
        int r = inp.nextInt();
        System.out.print("Enter the number of columns for array : ");
        int c = inp.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of array :");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]=inp.nextInt();
            }
        }
        return arr;
    }
    static void print2dArray(int[][] arr){
        if (arr.length==0){
            System.out.println("Array is empty");
        }
        else{
            for (int[] a : arr){
                System.out.println(Arrays.toString(a));
            }
        }
    }
    static int Search2d(int[][] arr, int target){
        if (arr.length==0){
            System.out.println("Array is empty");
        }
        else{
            for (int[] a: arr){
                for (int b: a){
                    if (b==target){
                        System.out.println("Present");
                        return 0;
                    }
                }
            }
            System.out.println("Absent");
        }
        return -1;
    }
}

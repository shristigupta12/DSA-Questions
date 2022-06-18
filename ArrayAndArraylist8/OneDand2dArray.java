package ArrayAndArraylist8;

import java.util.Arrays;

public class OneDand2dArray {
    public static void main(String[] args) {
        // 1D Array
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // Enhanced way to print array elements
        for(int num: arr){
            System.out.println(num + " ");
        }
        // More Enhanced way
        System.out.println(Arrays.toString(arr));


        // 2D Array
        int[][] myArray = new int[][]{{1,2}, {2, 3}, {3, 4}};
        // myArray.length --> number of rows       myArray[rowIndex].length --> number of columns
        // Enhanced way for printing 2D array
        for (int[] a: myArray){
            System.out.println(Arrays.toString(a));
        }

    }

}

package twoDMatrixQuestions;

import java.util.Arrays;
import java.util.Scanner;
public class q1Sorted2dArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] mat = inputArray();
        System.out.println("Enter the target element: ");
        int target = inp.nextInt();
        int[] index = bSearch(mat,target);
        System.out.println(Arrays.toString(index));
    }
    public static int[][] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix respectively: ");
        int row = inp.nextInt();
        int col = inp.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of matrix sorted in row and column manner : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        return arr;
    }
    public static int[] bSearch(int[][] mat,int target){
        int r = 0;
        int c = mat[0].length-1;
        while(r<mat.length && c>=0){
            if(mat[r][c]==target){
                return new int[]{r, c};
            }
            if(mat[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
public class Q23LuckyNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix :");
        int r = inp.nextInt();
        int c = inp.nextInt();
        int[][] arr = inputArray(r, c);
        ArrayList<Integer> ans = luckyNums(arr);
        System.out.println("The lucky number(s) is/are :");
        for(int i: ans){
            System.out.println(i);
        }
    }
    public static int[][] inputArray(int row, int col){
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array :");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        return arr;
    }
    public static ArrayList luckyNums(int[][] arr){
        ArrayList answer = new ArrayList<Integer>();
        int col = 0;
        for(int i=0; i<arr.length; i++){
            int min = arr[i][0];
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    col = j;
                }
            }
            int max = min;
            int count=0;
            for(int t=0; t<arr.length; t++){
                if(arr[t][col]>max){
                    break;
                }  
                count++;
            }
            if(count==arr.length){
                answer.add(max);
            }
        }
        return answer;
    }
}

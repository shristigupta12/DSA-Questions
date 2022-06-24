import java.util.Arrays;
import java.util.Scanner;

public class Q25reshapeTheMatrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = inputMatrix();
        reshapeArray(arr);
        }
    public static int[][] inputMatrix(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix : ");
        int r = inp.nextInt();
        int c = inp.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        return arr;
    }
    public static void reshapeArray(int[][] arr){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the rows and columns of new matrix : ");
        int row = inp.nextInt();
        int col = inp.nextInt();
        if(arr.length*arr[0].length!=row*col){
            for(int[] a: arr){
                System.out.println(Arrays.toString(a));
            }
        }
        else{
            int[] arr2 = new int[row*col];
            int count=0;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    arr2[count]=arr[i][j];
                    count++;
                }
            }
            count=0;            
            if(row==1){
                System.out.println(Arrays.toString(arr2));
            }
            else{
                int[][] ansArray = new int[row][col];
                for(int i=0; i<row; i++){
                    for(int j=0; j<col; j++){
                        ansArray[i][j] = arr2[count];
                        count++;
                    }
                }
                for(int[] t: ansArray){
                    System.out.println(Arrays.toString(t));
                }
            }
        }
    }
}

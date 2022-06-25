package assignments.ArrayArraylist3;
import java.util.Arrays;
import java.util.Scanner;

public class Q15MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // 15. Matrix Diagonal sum
        System.out.print("Enter the size of square matrix: ");
        int size = inp.nextInt();
        int[][] matrix= new int[size][size];
        for (int i=0; i<size; i++){
            System.out.println("Enter the elements of row "+(i+1)+" of matrix :");
            for (int j=0; j<size; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        int sum=0;
        for (int i=0; i<size; i++){
            sum+= matrix[i][i];
        }
        int j=0;
        for (int i=size-1; i>-1;i--){
            if (j<size && i!=j){
                sum+= matrix[i][j];
            }
            j++;
        }
        System.out.println("The sum of all the elements of the diagonal of matrix is : "+sum);
    }
}

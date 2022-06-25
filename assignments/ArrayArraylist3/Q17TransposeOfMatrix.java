package assignments.ArrayArraylist3;
import java.util.Arrays;
import java.util.Scanner;

public class Q17TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//      17. Transpose of a matrix
        System.out.print("Enter the number of rows and columns of matrix: ");
        int row = inp.nextInt();
        int col = inp.nextInt();
        int[][] matrix= new int[row][col];
        for (int i=0; i<row; i++){
            System.out.println("Enter the elements of row "+(i+1)+" of matrix :");
            for (int j=0; j<col; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
            int[][] transpose = new int[col][row];
            for (int i=0; i<col; i++) {
                for (int j = 0; j < row; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }
            for (int[] a : transpose){
                System.out.println(Arrays.toString(a));
            }
    }
}

package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q13FlippingImage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //      13. Flipping and inverting an image
        System.out.println("Enter the number of rows : ");
        int r = inp.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = inp.nextInt();
        int[][] arr = new int[r][c];
        for (int i=0; i<r; i++){
            System.out.println("Enter the elements of image "+(i+1));
            for (int j=0; j<c; j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][(c-1-j)];
                arr[i][c-1-j] = temp;
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

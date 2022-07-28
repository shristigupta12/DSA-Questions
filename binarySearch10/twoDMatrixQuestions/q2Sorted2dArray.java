package twoDMatrixQuestions;

import java.util.Arrays;
import java.util.Scanner;
// need to debug
public class q2Sorted2dArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] mat = inputArray();
        System.out.println("Enter the target element");
        int target = inp.nextInt();
        int[] ans = bSearch(mat,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[][] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix respectively: ");
        int row = inp.nextInt();
        int col = inp.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of matrix sorted normally : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = inp.nextInt();
            }
        }
        return arr;
    }
    public static int[] bSearch(int[][] mat, int target){
        int col = mat[0].length-1;
        int cmid = col/2;
        int rlow = 0;
        int rhigh = mat.length;
        while(rlow<rhigh){
            int rmid = (rlow+rhigh)/2;
            int element = mat[rmid][cmid];
            if(element==target){
                return new int[] {rmid, cmid};
            }
            if(rlow==rhigh+1){
                if(target==mat[rhigh][cmid]){
                    return new int[] {rhigh, cmid};
                }
                if(target<mat[rlow][cmid]){
                   return simpleBinarySearch(mat, target, 0, cmid-1, rlow );
                }
                if(target>mat[rhigh][cmid]){
                    return simpleBinarySearch(mat, target, cmid+1, col, rhigh );
                }else{
                    if(target<=mat[rlow][col]){
                        return simpleBinarySearch(mat, target, cmid+1, col, rlow );
                    }else{
                        return simpleBinarySearch(mat, target, 0, cmid-1, rhigh );
                    }
                }
            }
            if(element<target){
                rlow = rmid+1;
            }else{
                rhigh = rmid-1;
            }
        }
        return new int[]{-1, -1};
    } 
    public static int[] simpleBinarySearch(int[][] mat, int target, int cstart, int cend, int row ){
        int low = cstart;
        int high = cend;
        while(low<=high){
            int mid = (low+high)/2;
            int el = mat[row][mid];
            if(el==target){
                return new int[]{row,mid};
            }
            if(el>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{-1, -1};
    }
}

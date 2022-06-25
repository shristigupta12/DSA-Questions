package assignments.ArrayArraylist3;
// //Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

import java.util.*;

public class Q20ArrayRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int at = 0;
        System.out.println(at);
        at = 1;
        System.out.println(at);
        System.out.print("Enter the size of the matrices : ");
        int size = input.nextInt();
        int[][] mat = new int[size][size];
        int[][] target = new int[size][size];
        int[][] newMat = new int[size][size];
        System.out.println("Enter the elements of mat matrix : ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of target matrix : ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                target[i][j] = input.nextInt();
            }
        }
        boolean answer=false;
        for(int a=0; a<3; a++){
            System.out.println("On rotating the matrix 90 degrees:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                newMat[j][size-i-1] = mat[i][j];
                
            }
        }
        for(int[] x: newMat){
            System.out.println(Arrays.toString(x));
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                mat[i][j] = newMat[i][j];
            }
        }
        int count=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(newMat[i][j] != target[i][j] ){
                    break;
                }
                count++;
            }
        }
        if(count==size*size){
            answer = true;
            break;
        }
        }
        System.out.println(answer);
        
    }
}

// public static void main(String[] args) {
//     int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
//     int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
//     System.out.println(findRotation(mat,target));
// }
// public static boolean findRotation(int[][] mat, int[][] target) {
//     //rotation can be done only 4 times as 90*4=360, after 4 turns it'll return to original matrix
//     for (int i=0; i<4;i++){
//         if(same(mat,target)){
//             return true;
//         }
//         mat=rotate(mat);
//     }
//     return false;
// }
// public static boolean same(int[][] mat, int[][] target){
//     if(mat.length==target.length && mat[0].length==target[0].length){
//         for (int i=0; i<mat.length;i++){
//             for (int j=0; j<mat[0].length;j++){
//                 if(mat[i][j]!=target[i][j]){
//                     return false;
//                 }
//             }
//         }
//     }
//     return true;
// }
// public static int[][] rotate(int[][] mat){
//     int row=mat.length;
//     int col=mat[0].length;
//     int[][] mat2 =new int[row][col];
//     //basically row will turn into col and col will turn into row
//     for (int i=0; i<row; i++){
//         for (int j=0; j<col; j++){
//             mat2[j][row-i-1]=mat[i][j];
//         }
//     }
//     return mat2;
// }
// }
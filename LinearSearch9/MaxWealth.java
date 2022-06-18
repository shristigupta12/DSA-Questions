package LinearSearch9;

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] array = input2dArray();
        int person = array.length;
        int account = array[person].length;
        System.out.println(account);
        int[] ans = maxWealth(array, person, account);
        System.out.println("The person number "+ans[1]+" has maximum wealth of "+ans[0]+" rupees.");
    }
    static int[][] input2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of person : ");
        int person = input.nextInt();
        System.out.println("Enter number of accounts : ");
        int account = input.nextInt();
        int[][] arr = new int[person][account];
        System.out.println("Enter the wealth data : ");
        for (int i=0; i<person; i++){
            for (int j=0; j<account; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
    static int[] maxWealth(int[][]arr, int person, int account){
        int[] wealthArray = new int[person];
        for (int i=0; i<person; i++){
            wealthArray[i]=0;
            for (int y=0; y<account; y++){
                wealthArray[i]+= arr[i][y];
            }
        }
        int[] ans = new int[2];
        ans[0] = wealthArray[0];
        for (int a=0; a<person; a++){
            if (wealthArray[a]>ans[0]){
                ans[0] = wealthArray[a];
                ans[1] = a;
            }
        }
        return ans;
    }
}

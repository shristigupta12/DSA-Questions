package assignments.ArrayArraylist3;

import java.util.Arrays;
import java.util.Scanner;

public class Q6Candies {
    public static void main(String[] args) {
        //        6. Kids with the greatest number of candies
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of kids : ");
        int n = inp.nextInt();
        int[] candies = new int[n];
        inputArray(candies, n);
        System.out.print("Enter extra number of candies : ");
        int extraCan = inp.nextInt();
        boolean[] ans = new boolean[n];
        for (int i=0;i<n;i++){
            candies[i]+=extraCan;
            if (maxInArray(candies, n)==candies[i]){
                ans[i]=true;
            }
            else{
                ans[i] = false;
            }
            candies[i]-=extraCan;
        }
        System.out.println(Arrays.toString(ans));
    }
    static void inputArray(int[] array, int size){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        int s = 0;
        while(s<size){
            array[s]= inp.nextInt();
            s++;
        }
    }
    static int maxInArray(int[] arr, int size){
        int max = arr[0];
        for (int a: arr){
            if (a>max){
                max = a;
            }
        }
        return max;
    }
}

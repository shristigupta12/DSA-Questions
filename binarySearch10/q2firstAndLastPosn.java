// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

import java.util.Arrays;
import java.util.Scanner;
public class q2firstAndLastPosn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter the target element : ");
        int target = inp.nextInt();
        int[] ans = bSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

public static int[] inputArray(){
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = inp.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of array in ascendin order sorted : ");
    int s = 0;
    while(s<size){
        arr[s]= inp.nextInt();
        s++;
    }
    return arr;
}
public static int[] bSearch(int[] arr, int target){
    int[] ans = {-1,-1};
    int low = 0;
    int high = arr.length -1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<target){
            low = mid+1;
        }
        else if(arr[mid]>target){
            high = mid-1;
        }
        else{
            ans[0] = start_index(arr, target,mid,  low);
            ans[1] = end_index(arr, target,mid,  high);
            return ans;
        }
    }
    return ans ;
}
public static int start_index(int[] arr, int target, int m, int low){
    int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high+1;
    }

public static int end_index(int[] arr, int target, int m, int high){
    int low = m;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low-1;
    }
}

package binarySearch10;

import java.util.Arrays;
import java.util.Scanner;

public class BasicBsearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = arrayInput();
        int[] sortedArr = Asc(arr,arr.length);
        System.out.println(Arrays.toString(sortedArr));
        System.out.print("Enter the element you want to search in the array : ");
        int target = inp.nextInt();
        if (Bsearch(arr, target, arr.length)==-1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index "+Bsearch(arr, target, arr.length));
        }
    }

    static int[] arrayInput(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter all the elements of array : ");
        for (int i=0; i<size; i++){
            arr[i] = inp.nextInt();
        }
        return arr;
    }
    static int[] Asc(int[] arr, int size){
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int Bsearch(int[] arr, int target, int size){
        int start = 0;
        int end = size-1;
        int mid = start+end/2;
        while(start!=end){
            if (target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start+end/2;
        }
        if (target == arr[start]){
            return start;
        }
        return -1;
    }
}

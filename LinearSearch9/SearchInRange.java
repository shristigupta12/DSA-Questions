package LinearSearch9;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr;
        arr = inputArray();
        if(rangeSearch(arr, 4, 2, 5)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }
    }

    static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array :");
        for (int i=0; i<arr.length; i++){
            arr[i]=inp.nextInt();
        }
        return arr;
    }
    static boolean rangeSearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return false;
        }
        for (int i=start; i<=end; i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

}

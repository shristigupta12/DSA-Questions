import java.util.Scanner;

public class orderAgnosticBS {
    // Identifying in which order the array elements are sorted(Ascending/Descending) and then applying Binary Search in it is called Order Agnostic Binary Search
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter the target element : ");
        int target = inp.nextInt();
        int index = OABinarySearch(arr, isAscending(arr), target);
        if(index!=-1){
            System.out.println("The target element is present at index "+index);
        }
        else{
            System.out.println("Element is not present in the array");
        }
    }
    static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        int s = 0;
        while(s<size){
            arr[s]= inp.nextInt();
            s++;
        }
        return arr;
    }
    static boolean isAscending(int[] arr){
        if(arr[0]<arr[arr.length-1]){
            return true;
        }
        return false;
    }
    static int OABinarySearch(int[] arr,boolean isAscen,int target ){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+end/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(isAscen){
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

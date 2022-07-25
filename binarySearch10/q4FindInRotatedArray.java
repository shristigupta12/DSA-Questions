import java.util.Scanner;
public class q4FindInRotatedArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        int pivotIndex = Returnpivot(arr);
        System.out.println(pivotIndex);
        System.out.println(arr[pivotIndex]);
        System.out.println("Enter the target element : ");
        int target = inp.nextInt();
        int answer = BinarySearch(arr,pivotIndex, target);
        System.out.println(answer);
    }
    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of rotated array: ");
        int s = 0;
        while(s<size){
            arr[s]= inp.nextInt();
            s++;
        }
        return arr;
    }
    public static int Returnpivot(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid<high && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>low && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr, int pivot, int target){
        int low=0;
        int high=arr.length-1;
        if(target>=arr[0]){
            high = pivot;
        }else{
            low= pivot+1;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}

// Try putting conditions for duplicate elements in array

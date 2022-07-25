import java.util.Scanner;
public class q5FindRotationCount {
    public static void main(String[] args) {       
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        int pivotIndex = pivotIndex(arr);
        System.out.println(pivotIndex+1);
    }
    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of rotated array : ");
        int s = 0;
        while(s<size){
            arr[s]= inp.nextInt();
            s++;
        }
        return arr;
    }
    public static int pivotIndex(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>end){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}

//Find the peak element of a mountain array
import java.util.Scanner;
public class q3PeakEl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.println(bSearch(arr));
    }
    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of mountain array : ");
        int s = 0;
        while(s<size){
            arr[s]= inp.nextInt();
            s++;
        }
        return arr;
    }
public static int bSearch(int[] arr){
    int low = 0;
    int high = arr.length -1;
    while(low<high){
        int mid = (low+high)/2;
        if(arr[mid]>arr[mid+1]){
            high = mid;
        }else{
            low=mid+1;
        }
    }
    return low;
}        
}

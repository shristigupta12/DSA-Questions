import java.util.Scanner;

public class q1CeilingOfANum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter the target element: ");
        int target = inp.nextInt();
        int targetInd = Ceiling(arr, target);
        if(targetInd==-1){
            System.out.println("Ceiling of "+target+" is not present!");
        }
        else{
            System.out.println("Celeing of "+target+" is: "+arr[targetInd]);
        }
    }
    public static int[] inputArray(){
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
    public static int Ceiling(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        if(target>arr[high]){
            return -1;
        }
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }           
        }
       return high;
    }
}

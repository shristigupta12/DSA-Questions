package assignments.ArrayArraylist3;
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.*;
public class Q21Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = input.nextInt();
        int a=-1,b=-1;
        for(int m=0; m<size-1; m++){
            for(int n=m+1; n<size; n++){
                if(arr[m]+arr[n]==target){
                    a=m;
                    b=n;
                    break;
                }
            }
        }
        if(a!=-1){
            System.out.println("The indices are : "+a+" and "+b);
        }
        else{
            System.out.println("No such numbers exist in array");
        }
    }
}

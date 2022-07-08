package binarySearch10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class BinarySearchCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> vec = inputVector();
        System.out.print("Enter the number that you want to search in the array: ");
        int target = input.nextInt();
        int index = BinarySearch(vec, target);
        System.out.println(index);  
    }
    
    //Input vector
    public static Vector<Integer> inputVector(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements of array : ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array");
        Vector<Integer> vec = new Vector<Integer>(100);
        for(int i=0; i<size; i++){
            vec.add(input.nextInt());
        }
        return vec;
    }
    // returning the index of the element and returning -1 if it does not exist
    public static int BinarySearch(Vector<Integer> vec, int target){
        int low = 0;
        int high = vec.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==vec.get(mid)){
                return mid;
            }
            else if(target>vec.get(mid)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    } 
}

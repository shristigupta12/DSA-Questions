package assignments.LinearSearch4;

import java.util.Scanner;
import java.util.Vector;

public class Q2TwoSum {
/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.*/

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Vector<Integer> vec = new Vector<Integer>(50);
        System.out.println("Enter the size of the array : ");
        int size = inp.nextInt();
        System.out.println("Enter the increasingly sorted integers of array : ");
        for(int i=0; i<size; i++){
            vec.add(inp.nextInt());
        }
        System.out.print("Enter the target element : ");
        int target = inp.nextInt();
        int i1=0, i2 = 0;
        int i=0, j=0;
        while(i<size){
            j=i+1;
            while(j<size){
                if(vec.get(i)+vec.get(j)==target){
                    i1=i;
                    i2=j;
                    break;
                }
                j++;
            }
            if(i2!=0){
                break;
            }
            i++;
        }
        if(i==size){
            System.out.println("No two elements exist");
        }
        else{

            System.out.println("The indices are : "+(i1+1)+" and "+(i2+1) );
        }
    }
}
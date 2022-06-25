package assignments.ArrayArraylist3;
import java.util.Scanner;

public class Q24maxSubarray{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        int[] answer = ans(arr);
        System.out.println("The subarray with maximum sum is : ");
        for(int a=answer[1]; a<answer[2]+1; a++){
            System.out.println(arr[a]);
        }
        System.out.print("The maximum sum is : ");
        System.out.println(answer[0]);
    }
    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = inp.nextInt();
        System.out.println("Enter all the elements of array :");
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = inp.nextInt();
        }
        return arr;
    }
    public static int[] ans(int[] arr){
        int max=arr[0];
        int start=0;
        int end=0;
        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            for(int j=i+1; j<arr.length; j++){
                sum+=arr[j];
                if(sum>max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        int[] Ansarray = new int[3];
        Ansarray[0] = max;
        Ansarray[1] = start;
        Ansarray[2] = end;
        return Ansarray;
    }
}
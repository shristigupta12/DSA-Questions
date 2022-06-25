package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q9TargetArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //        9. Create target array in the given order
        System.out.print("Enter the size of arrays : ");
        int size = inp.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the details of nums array : ");
        inputArray(nums,size);
        int[] index = new int[size];
        System.out.println("Enter the details of index array : ");
        inputArray(index,size);
        int[] target = new int[size];
        for (int i=0;i<size; i++){
            if (index[i]==i){
                target[i] = nums[i];
            }
            else{
                int in = index[i];
                for (int j=i; j>in;j--){
                    target[j]=target[j-1];
                }
                target[in] = nums[i];
            }
        }
        System.out.println(Arrays.toString(target));
    }
    static void inputArray(int[] array, int size){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        int s = 0;
        while(s<size){
            array[s]= inp.nextInt();
            s++;
        }
    }
}

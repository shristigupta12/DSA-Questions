package assignments.ArrayArraylist3;
import java.util.Arrays;
import java.util.Scanner;

public class Q18ArrayFormOfInt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//       18. Add to array form of integer
        System.out.print("Enter the size of array : ");
        int s = inp.nextInt();
        int[] arr = new int[s];
        inputArray(arr,s);
        System.out.print("Enter the value of k : ");
        int k = inp.nextInt();
        int num = 0;
        for (int i=0; i<s; i++){
            num = (num*10)+arr[i];
        }
        int newNum = num + k;
        newNum = numReverse(newNum);
        int[] newArr = new int[String.valueOf(newNum).length()];
        int i = 0;
        while(newNum>0){
            int r = newNum%10;
            newArr[i] = r;
            i++;
            newNum/=10;
        }
        System.out.println("The array form of integer num+k is : ");
        System.out.println(Arrays.toString(newArr));
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
    static int numReverse(int num){
        int n = 0;
        while(num>0){
            int r=num%10;
            num/=10;
            n = n*10+r;
        }
        return n;
}
}

import java.util.*;
public class Q22NUniqueIntegerSumZero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer n : ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                arr[i] = i+1;
                arr[n-i-1]=-(i+1);
            }
        }
        else{
            arr[0]=0;
            for(int i=1; i<n+1/2; i++){
                arr[i] = i;
                arr[n-i]=-i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

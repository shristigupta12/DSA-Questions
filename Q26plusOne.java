import java.util.Arrays;
import java.util.Scanner;

public class Q26plusOne {
    public static void main(String[] args) {
        int[] numArr = inputInteger();
        int[] ans = plusOneArray(numArr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] inputInteger(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the digits from the most significant to the least :"); 
        for(int i=0; i<n; i++){
            arr[i]=inp.nextInt();
        }
        return arr;
    }
    public static int[] plusOneArray(int[] num){
        int size = num.length;
        if(num[size-1]!=9){
            num[size-1]+=1;
            return num;
        }
        else{
            for(int i=size-1; i>-1; i--){
                if(i==0){
                        num[0] = 0;
                        int[] newNum = new int[size+1];
                        newNum[0] = 1;
                        for(int a=0; a<size; a++ ){
                            newNum[a+1] = num[a];
                        return newNum;
                    }
                }
                if(num[i-1]!=9){
                    num[i]=0;
                    num[i-1]+=1;
                    break;
                }
                else{
                    num[i]=0;
                }
            }
            return num;
        }
    }
}

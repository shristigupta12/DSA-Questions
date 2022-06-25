package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q12HighestAltitude {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //      12. Find the highest altitude
        System.out.print("Enter the number of altitudes : ");
        int size = inp.nextInt();
        int[] gains = new int[size];
        System.out.println("Enter the net gains at all the altitudes : ");
        inputArray(gains,size);
        int[] altitudes = new int[size+1];
        int al = 0;
        int maxAl = -1000;
        for (int i=0; i<=size; i++){
            if (i==0){
                altitudes[i]=0;
            }
            else{
                al+=gains[i-1];
                altitudes[i]=al;
            }
            if (maxAl<altitudes[i]){
                maxAl = altitudes[i];
            }
        }
        System.out.println("The maximum altitude recorded is "+maxAl);
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

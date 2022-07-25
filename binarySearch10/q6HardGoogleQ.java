import java.util.Scanner;
public class q6HardGoogleQ {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter m: ");
        int m = inp.nextInt();
        System.out.println(Bsearch(arr, m));
    }
    public static int[] inputArray(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the positive elements of array : ");
        int s = 0;
        while(s<size){
            arr[s]= inp.nextInt();
            s++;
        }
        return arr;
    }
    public static int Bsearch(int[] arr, int m){
        int start=0;
        int end=0;
        for(int a: arr){
            if(a>start){
                start = a;
            }
            end+=a;
        }
        while(start<end){
            int mid=(start+end)/2;
            int count=1;
            int sum=0;
            for(int a: arr){
                if(sum+a>mid){
                    sum = a;
                    count++;
                }else{
                    sum+=a;
                }
            }     
            if(count>m){
                start = mid+1;
            }else{
                end = mid;
            }  
        }
    return end;
    }
}

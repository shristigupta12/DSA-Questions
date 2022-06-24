package assignments;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

// LEETCODE PROBLEMS

public class ArraysArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//       1. Build Array from permutation

//       2. Concatenation of Array
        /*System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        displayArray(arr, size);
        int[] concatArr = Concat(arr, size);
        displayArray(concatArr, 2*size);*/

//       3. Running sum of 1d array
        /*System.out.println("Enter the size of arrays : ");
        int size = inp.nextInt();
        int[] arr1 = new int[size];
        inputArray(arr1, size);
        int[] arr2 = new int[size];
        inputArray(arr2, size);
        System.out.println(Arrays.toString(sumOfArray(arr1, arr2)));*/


//       5. Shuffle the array in the order: if input = [a1, a2, a3, b1, b2, b3] then output should be [a1, b1, a2, b2, a3, b3]
        /*int[] sArray = new int[6];
        inputArray(sArray, 6);
        System.out.println(Arrays.toString(shuffleArray(sArray, 6)));*/

//        6. Kids with the greatest number of candies
        /*System.out.print("Enter the number of kids : ");
        int n = inp.nextInt();
        int[] candies = new int[n];
        inputArray(candies, n);
        System.out.print("Enter extra number of candies : ");
        int extraCan = inp.nextInt();
        boolean[] ans = new boolean[n];
        for (int i=0;i<n;i++){
            candies[i]+=extraCan;
            if (maxInArray(candies, n)==candies[i]){
                ans[i]=true;
            }
            else{
                ans[i] = false;
            }
            candies[i]-=extraCan;
        }
        System.out.println(Arrays.toString(ans));*/

//       7. Number of good pairs
        /*System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        int count = 0;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (arr[j]==arr[i]){
                    count++;
                }
            }
        }
        System.out.println("Number of good pairs : "+count);*/

//       8. How many numbers are smaller than the current number
        /*System.out.print("Enter the size of array : ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        inputArray(arr, size);
        int[] ans = new int[size];
        for (int i=0; i<size; i++){
            int count = 0;
            for (int j=0; j<size; j++){
                if (arr[j]<arr[i]){
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));*/

//        9. Create target array in the given order
        /*System.out.print("Enter the size of arrays : ");
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
        System.out.println(Arrays.toString(target));*/

//      10. Check whether the statement is pangram
        /*System.out.print("Enter a statement : ");
        String st = inp.nextLine();
        if (uppercaseCheck(st)){
            System.out.println("Constraint: Every letter in the statement must be in lowercase.");
        }
        else if(st.length()<1 || st.length()>1000){
            System.out.println("Number of characters in the string should be between 1 and 1000");
        }
        else{
            boolean pangramCheck = true;
            for (int i=97; i<=122; i++){
               char alphabet = (char)i;
               int j;
               for (j=0; j<st.length(); j++){
                   if (alphabet==st.charAt(j)){
                       break;
                   }
               }
               if (j==st.length()){
                   pangramCheck = false;
                   System.out.println("Statement is not a pangram");
                   break;
               }
            }
            if (pangramCheck){
                System.out.println("Statement is pangram");
            }
        }*/

//      11. Count items matching a rule     ------------------- error coming up
        /*System.out.print("Enter the number of items : ");
        int size = inp.nextInt();
        String[][] items = new String[size][3];
        for (int i=0; i<size; i++){
            System.out.println("Enter the type of item "+(i+1));
            items[i][0] = inp.nextLine();
            System.out.println("Enter the color of item "+(i+1));
            items[i][1] = inp.nextLine();
            System.out.println("Enter the name of item "+(i+1));
            items[i][2] = inp.nextLine();
        }
        System.out.println(Arrays.toString(items));
        System.out.print("Enter the rule key : ");
        String rulekey = inp.nextLine();
        System.out.print("Enter the rule value : ");
        String ruleValue = inp.nextLine();
        int j=0;
        switch (rulekey){
            case "type" -> j=0;
            case "color" -> j=1;
            case "name" -> j=2;
            default -> System.out.println("Enter a valid rule key");
        }
        int count = 0;
        for (int i=0; i<size; i++){
            if (items[i][j]==ruleValue){
                count++;
            }
        }
        System.out.println("The number of items matching the rule are "+count);*/

//      12. Find the highest altitude
        /*System.out.print("Enter the number of altitudes : ");
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
        System.out.println("The maximum altitude recorded is "+maxAl);*/

//      13. Flipping and inverting an image
        /*System.out.println("Enter the number of rows : ");
        int r = inp.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = inp.nextInt();
        int[][] arr = new int[r][c];
        for (int i=0; i<r; i++){
            System.out.println("Enter the elements of image "+(i+1));
            for (int j=0; j<c; j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][(c-1-j)];
                arr[i][c-1-j] = temp;
            }
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }*/

//      14. Cells with odd values in a matrix
//        Will do them later

//      15. Matrix Diagonal sum
        /*System.out.print("Enter the size of square matrix: ");
        int size = inp.nextInt();
        int[][] matrix= new int[size][size];
        for (int i=0; i<size; i++){
            System.out.println("Enter the elements of row "+(i+1)+" of matrix :");
            for (int j=0; j<size; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        int sum=0;
        for (int i=0; i<size; i++){
            sum+= matrix[i][i];
        }
        int j=0;
        for (int i=size-1; i>-1;i--){
            if (j<size && i!=j){
                sum+= matrix[i][j];
            }
            j++;
        }
        System.out.println("The sum of all the elements of the diagonal of matrix is : "+sum);*/

//      16. Find numbers with even number of digits
        /*System.out.print("Enter the size of array : ");
        int s = inp.nextInt();
        int[] arr= new int[s];
        inputArray(arr, s);
        int ans = 0;
        for (int num : arr){
            int n = num; int count =0;
            while(n>0){
                n/=10;
                count++;
            }
            if (count%2==0){
                ans++;
            }
        }
        System.out.println("The number of elements with even number of digits are : "+ans);*/

//      17. Transpose of a matrix
        /*System.out.print("Enter the number of rows and columns of matrix: ");
        int row = inp.nextInt();
        int col = inp.nextInt();
        int[][] matrix= new int[row][col];
        for (int i=0; i<row; i++){
            System.out.println("Enter the elements of row "+(i+1)+" of matrix :");
            for (int j=0; j<col; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
            int[][] transpose = new int[col][row];
            for (int i=0; i<col; i++) {
                for (int j = 0; j < row; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }
            for (int[] a : transpose){
                System.out.println(Arrays.toString(a));
            }*/
//       18. Add to array form of integer
        /*System.out.print("Enter the size of array : ");
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
        System.out.println(Arrays.toString(newArr));*/


        
    }//----------------------------

    static void inputArray(int[] array, int size){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        int s = 0;
        while(s<size){
            array[s]= inp.nextInt();
            s++;
        }
    }
    static int[] sumOfArray(int[] a1, int[] a2){
        int[] newArr = new int[a1.length];
        for (int i=0; i<a1.length; i++){
            newArr[i] = a1[i] + a2[i];
        }
        return newArr;
    }
    static void displayArray(int[] array, int size){
        System.out.println(Arrays.toString(array));
    }
    static int[] Concat(int[] array, int size) {
        System.out.println("The concatenated array is : ");
        int s = 2 * size;
        int[] arr = new int[s];
        int t = 0;
        for (int a = 0; a < 2*size; a++) {
            arr[a]=array[t];
            t++;
            if (t==size){
                t=0;
            }
        }
        return arr;
    }
    static int[] shuffleArray(int[] arr, int size){
        int count = size/2;
        int[] newArray = new int[size] ;
        int j=0;
        for (int i=0; i<size; i+=2){
                newArray[i] = arr[j];
                newArray[i+1] = arr[count];
                count++;
                j++;
        }
        return newArray;
    }
    static int maxInArray(int[] arr, int size){
        int max = arr[0];
        for (int a: arr){
            if (a>max){
                max = a;
            }
        }
        return max;
    }
    static boolean uppercaseCheck(String s){
        for (int i=0; i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
    static int numReverse(int num){
        int n = 0;
        while(num>0){
            int r=num%10;
            num/=10;
            n = n*10+r;
        }
        return n;
}}

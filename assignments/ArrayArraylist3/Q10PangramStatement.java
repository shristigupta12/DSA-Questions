package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q10PangramStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //      10. Check whether the statement is pangram
        System.out.print("Enter a statement : ");
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
        }
    }
    static boolean uppercaseCheck(String s){
        for (int i=0; i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
